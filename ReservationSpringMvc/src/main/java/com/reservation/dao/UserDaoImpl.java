package com.reservation.dao;

import java.util.List;


import com.reservation.model.User;
import com.reservationHibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao{
    Session session = null;

    public void createUser(User user) {
       Transaction transaction = null;
        try {
        	 session = HibernateUtil.getSession();
        	 transaction = session.beginTransaction();
        	 session.persist(user);
        	 transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

    }

    public User getUserById(Long id) {
        session = HibernateUtil.getSession();
        session.beginTransaction();
        User user = session.find(User.class, id);
        session.getTransaction().commit();
        return user;
    }

    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
		List<User> userList = session.createQuery("From Users ").list();
        session.getTransaction().commit();
        return userList;
    }

    public void dropUser(Long id) {
    	User user = getUserById(id);
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();
			System.out.println("Etudiant delete !");

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}

		}
    }

    public User updateUser(User user) {
        User userUp;
        session = HibernateUtil.getSession();
        session.beginTransaction();
        userUp = session.find(User.class, user.getId());
        if (userUp != null){
            userUp.setPrenom(user.getPrenom());
            userUp.setNom(user.getNom());
            userUp.setEmail(user.getEmail());
            userUp.setPassword(user.getPassword());
            userUp.setRole(user.getRole());
            System.out.println("User updated");
        }else{
            System.out.println("User Not Exist");
        }
        session.getTransaction().commit();
        return userUp;
    }

	
}