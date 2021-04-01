package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@NamedQuery(query = "SELECT u FROM Users u where u.email = :email", name = "userByEmail")
public class Users implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long idUsers;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    @OneToOne (mappedBy = "users")
    private Admin admin;
    @OneToOne (mappedBy = "users")
    private Apprenant apprenant;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    public Users() {
    }

    public Users( String nom, String prenom, String email, String password, Admin admin, Apprenant apprenant, Roles roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.apprenant = apprenant;
        this.roles = roles;
    }
    public Users( String nom, String prenom, String email, String password, Roles roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Users(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;

    }


    public Users(Long idUsers, String nom, String prenom, String email, String password, Roles roles) {
        this.idUsers = idUsers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Long idUsers) {
        this.idUsers = idUsers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Apprenant getApprenant() {
        return apprenant;
        
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				+ password + ", admin=" + admin + ", apprenant=" + apprenant + ", roles=" + roles + "]";
	}

	


}
