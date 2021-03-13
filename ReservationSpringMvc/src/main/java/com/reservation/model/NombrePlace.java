package com.reservation.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nombre_place database table.
 * 
 */
@Entity
@Table(name="nombre_place")
@NamedQuery(name="NombrePlace.findAll", query="SELECT n FROM NombrePlace n")
public class NombrePlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ajoute")
	private Date dateAjoute;

	private int nombre;

	//bi-directional many-to-one association to Reservation
	@ManyToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;

	public NombrePlace() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateAjoute() {
		return this.dateAjoute;
	}

	public void setDateAjoute(Date dateAjoute) {
		this.dateAjoute = dateAjoute;
	}

	public int getNombre() {
		return this.nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Reservation getReservation() {
		return this.reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}