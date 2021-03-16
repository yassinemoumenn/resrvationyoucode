package com.reservation.model;


public class Login  {


		
		private int id;

		private String email;

		private String nom;

		private String password;

		private String prenom;

		public Login() {
		
		}

		public Login(int id, String email, String nom, String password, String prenom) {
			super();
			this.id = id;
			this.email = email;
			this.nom = nom;
			this.password = password;
			this.prenom = prenom;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		
		
		  }

		
