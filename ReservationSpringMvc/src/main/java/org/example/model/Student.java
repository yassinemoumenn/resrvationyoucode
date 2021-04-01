package org.example.model;


import javax.persistence.*;
import java.io.Serializable;
@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name = "studentId")
@Table(name = "student")
public class Student extends Users implements Serializable {
    @Column(nullable = false)
    private String nombreReservation;

    public String getNombreReservation() {
        return nombreReservation;
    }

    public void setNombreReservation(String reservationMax) {
        this.nombreReservation = reservationMax;
    }

}

