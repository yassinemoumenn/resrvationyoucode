package org.example.repository;

import java.sql.SQLException;

import javax.persistence.NoResultException;

import org.example.model.Roles;
import org.example.model.Users;
import org.example.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {


	@Override
	public boolean validate(String email, String password) throws SQLException, ClassNotFoundException {
		Transaction transaction = null;
		Users user = null;
		try {
			// start a transaction
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			// get an user object
			user = (Users) session.createQuery("FROM Users U WHERE U.email= :email").setParameter("email", email)
					.uniqueResult();

			if (user != null && user.getPassword().equals(password)) {
				return true;
				
			}
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}


    Session session=null;

	@Override
    public Roles getByRole(Long id)throws SQLException, ClassNotFoundException  {
        Roles role = null;
        
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
            role = (Roles) session.get(Roles.class, id);
            System.out.println("role lu !");
        } finally {
            if (session != null) {
            	session.close();
            }

        }

        return role;
    }

    @Override
    public Users getByEmail(String email) {

        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query =  session.createQuery("FROM Users U WHERE U.email= :email");
        query.setParameter("email", email);
        
        
        try {
      
            Users user = (Users) query.uniqueResult();
            return user;
        }
        catch (NoResultException  e){
            return null;
        }
       
	
	
	
	
//	@Transactional
//	public Users getByEmail(String userEmail) {
//		
////  
//		
//        session = HibernateUtil.getSessionFactory().openSession();
//		
//		Query query = session.createQuery("FROM Users U WHERE U.email= :email");
//		query.setParameter("userEmail",userEmail);
//		System.out.println(userEmail);
//		List<Users> users =  query.getResultList();
//		
//		if (users.size() > 0) {
//			Users user = users.get(0);
//			return user;
//		}
//		
//		return null;
//	}
////        return user;
//
////        try {
//////            Users user =   ((Users) query).getSingleResult();
//////         Users user = (Users) query.getSingleResult();
////            return user;
////        }
////        catch (Exception e){
////            return null;
////        }
////	
////	
//    }

    }
}
