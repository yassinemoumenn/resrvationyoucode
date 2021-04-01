package org.example.model;
import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name ="user_id" )
public class Apprenant extends Users implements Serializable {
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "idUsers")
    private Users users;
    
    @OneToMany(mappedBy = "apprenant")
    
    private List<Reservation> reservations;

    public Apprenant() {

    }
    public Apprenant(Users users) {
        this.users = users;
    }

    public Apprenant(String nom, String prenom, String email, String password, Admin admin, Apprenant apprenant, Roles roles, Users users) {
        super(nom, prenom, email, password, admin, apprenant, roles);
        this.users = users;
    }
    
    
    public Apprenant(String nom, String prenom, String email, String password,  Roles roles, Users users) {
        super(nom, prenom, email, password, roles);
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }
    

    public void setUsers(Users users) {
        this.users = users;
    }
}
