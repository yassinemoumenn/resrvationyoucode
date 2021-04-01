//package org.example.repository;
//
//import org.example.model.Apprenant;
//import org.example.util.HibernateUtil;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.SharedSessionContract;
//import org.hibernate.Transaction;
//import org.springframework.stereotype.Repository;
//
//
//@Repository("ApprenantRepository")
//
//public class ApprenantRepositoryImpl implements ApprenantRepository {
//
//	@Override
//	public Apprenant getApprenantDetailsByEmailAndPassword(String email, String password) {
//		Transaction transaction = null;
//		Apprenant apprenant = null;
//        try  {
//            SessionFactory session = HibernateUtil.getSessionFactory();
//            // start a transaction
//
//            transaction = ((SharedSessionContract) session).beginTransaction();
//            // get an user object
//            apprenant = (Apprenant) ((SharedSessionContract) session).createQuery("FROM Apprenant U WHERE U.userEmail = :email").setParameter("email", email)
//                    .uniqueResult();
//
//            if (apprenant != null && apprenant.getPassword().equals(password)) {
//                return apprenant;
//            }
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//}
