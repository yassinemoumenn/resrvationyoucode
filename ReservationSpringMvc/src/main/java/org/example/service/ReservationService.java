package org.example.service;

import java.util.List;

import org.example.model.Reservation;

public interface ReservationService {

	
	
	  public void addReservation(Reservation reservation);
	  
	    public List<Reservation> getAllReservation();
	 
	    public void deleteReservation(long idReservation);
	 
	    public Reservation getReservation(long idReservation);
	 
	    public Reservation updateReservation(Reservation Reservation);
}
