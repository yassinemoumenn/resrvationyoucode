package org.example.dao;

import java.util.List;


import org.example.model.Reservation;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository

public class ReservationDaoImpl  implements ReservationDao  {

    Session session;

    @Override
    public void createReservation(Reservation reservation) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();
        session.persist(reservation);
        transaction.commit();
    }

	@Override
	public Reservation getReservationById(long id) {
		Reservation reservation = null;
		Session session = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();
			// get reservation by id
			reservation = (Reservation) session.get(Reservation.class, id);
			System.out.println("Reservation  !");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return reservation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservation() {
		  session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        List<Reservation> reservationList = session.createQuery("From Reservation ").list();
	        session.getTransaction().commit();
	        return reservationList;
	}

	@Override
	public void dropReservation(long id) {
		Reservation reservation;
	        session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        reservation = (Reservation) session.get(Reservation.class, id);

	        if (reservation != null){
	            session.delete(reservation);
	            session.flush();
	            System.out.println("drop Reservation");
	        }else{
	            System.out.println("Reservation Not Exist");
	        }
	        session.getTransaction().commit();		
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		Reservation reservationUpdate;
	        session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
           reservationUpdate = (Reservation) session.get(Reservation.class, reservation.getIdReservation());

      if(reservationUpdate != null) {
    	  reservationUpdate.setIdReservation(reservation.getIdReservation());
    	  reservationUpdate.setDateReservation(reservation.getDateReservation());
          reservationUpdate.setConfirmation(reservation.isConfirmation());
          reservationUpdate.setIdReservation(reservation.getIdReservation());
          reservationUpdate.setApprenant(reservation.getApprenant());
    	  
    	  	System.out.println("Reservation updated");

    	  
           }else{
            System.out.println("User Not Exist");
           }  
            session.getTransaction().commit();
	    	return reservationUpdate;

    

}


	

}
