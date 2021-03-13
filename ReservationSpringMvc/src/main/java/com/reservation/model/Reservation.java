package com.reservation.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
@NamedQuery(name="Reservation.findAll", query="SELECT r FROM Reservation r")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_reservation")
	private int idReservation;

	private byte confirmation;

	@Temporal(TemporalType.DATE)
	@Column(name="date_reservation")
	private Date dateReservation;

	@Column(name="type_reservation")
	private String typeReservation;

	//bi-directional many-to-one association to NombrePlace
	@OneToMany(mappedBy="reservation")
	private List<NombrePlace> nombrePlaces;

	//bi-directional many-to-one association to Apprenant
	@ManyToOne
	@JoinColumn(name="id_user")
	private Apprenant apprenant;

	public Reservation() {
	}

	public int getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public byte getConfirmation() {
		return this.confirmation;
	}

	public void setConfirmation(byte confirmation) {
		this.confirmation = confirmation;
	}

	public Date getDateReservation() {
		return this.dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public String getTypeReservation() {
		return this.typeReservation;
	}

	public void setTypeReservation(String typeReservation) {
		this.typeReservation = typeReservation;
	}

	public List<NombrePlace> getNombrePlaces() {
		return this.nombrePlaces;
	}

	public void setNombrePlaces(List<NombrePlace> nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public NombrePlace addNombrePlace(NombrePlace nombrePlace) {
		getNombrePlaces().add(nombrePlace);
		nombrePlace.setReservation(this);

		return nombrePlace;
	}

	public NombrePlace removeNombrePlace(NombrePlace nombrePlace) {
		getNombrePlaces().remove(nombrePlace);
		nombrePlace.setReservation(null);

		return nombrePlace;
	}

	public Apprenant getApprenant() {
		return this.apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

}