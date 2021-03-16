package com.reservation.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_user")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;

	private String email;

	private String nom;

	private String password;

	private String prenom;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;

	public User() {
	}

	public User(String email, String nom, String password, String prenom, Role role) {
		super();
		this.email = email;
		this.nom = nom;
		this.password = password;
		this.prenom = prenom;
		this.role = role;
	}

	public Long getId() {
		return this.idUser;
	}

	public void setId(Long id) {
		this.idUser = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + idUser + ", email=" + email + ", nom=" + nom + ", password=" + password + ", prenom=" + prenom
				+ ", role=" + role + "]";
	}

}