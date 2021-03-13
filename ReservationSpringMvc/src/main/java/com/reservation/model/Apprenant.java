package com.reservation.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the apprenant database table.
 * 
 */
@Entity
@NamedQuery(name="Apprenant.findAll", query="SELECT a FROM Apprenant a")
public class Apprenant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="apprenant_id")
	private int apprenantId;

	private String email;

	@Column(name="id_role")
	private int idRole;

	@Column(name="id_user")
	private int idUser;

	@Column(name="nmbr_reservation")
	private int nmbrReservation;

	private String nom;

	private String password;

	private String prenom;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="apprenant")
	private List<Reservation> reservations;

	public Apprenant() {
	}

	public int getApprenantId() {
		return this.apprenantId;
	}

	public void setApprenantId(int apprenantId) {
		this.apprenantId = apprenantId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getNmbrReservation() {
		return this.nmbrReservation;
	}

	public void setNmbrReservation(int nmbrReservation) {
		this.nmbrReservation = nmbrReservation;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setApprenant(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setApprenant(null);

		return reservation;
	}

}