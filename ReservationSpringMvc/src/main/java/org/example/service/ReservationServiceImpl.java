package org.example.service;

import java.util.List;



import org.example.dao.ReservationDao;
import org.example.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ReservationServiceImpl  implements ReservationService{
	
	@Autowired
    private ReservationDao reservationDao;

	 @Override
	 @Transactional
	public void addReservation(Reservation reservation) {
		reservationDao.createReservation(reservation);

		
	}

	 @Override
	    @Transactional
	public List<Reservation> getAllReservation() {
		
		return reservationDao.getAllReservation();
	}

	@Override
	public void deleteReservation(long idReservation) {
		reservationDao.dropReservation(idReservation);
	}

	public Reservation getReservation(long idReservation) {
		return reservationDao.getReservationById(idReservation);
		

	}

	public Reservation updateReservation(Reservation Reservation) {
		return reservationDao.updateReservation(Reservation);
		
	}

	public ReservationDao getReservationDao() {
		return reservationDao;
	}

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	
}
