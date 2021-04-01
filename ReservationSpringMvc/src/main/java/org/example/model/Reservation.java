package org.example.model;
import javax.persistence.*;


import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idReservation;
    

    @Temporal(TemporalType.DATE)
    private Date dateReservation;
    
    private boolean confirmation;
    
    private String typeReservation;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    
    private Apprenant apprenant;

    public Reservation() {
    }

    public Reservation(Date dateReservation, boolean confirmation, Apprenant apprenant) {
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.apprenant = apprenant;
    }
    
    

    public Reservation(Date dateReservation, Apprenant apprenant) {
		this.dateReservation = dateReservation;
		this.apprenant = apprenant;
	}

    
	public Reservation(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	public Reservation(Date dateReservation, boolean confirmation, String typeReservation, Apprenant apprenant) {
		super();
		this.dateReservation = dateReservation;
		this.confirmation = confirmation;
		this.typeReservation = typeReservation;
		this.apprenant = apprenant;
	}

    
    public Reservation(Long idReservation, Date dateReservation, boolean confirmation, Apprenant apprenant) {
        this.idReservation = idReservation;
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.apprenant = apprenant;
    }
    
    


	public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }



    public Apprenant getApprenant() {
        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

	public String getTypeReservation() {
		return typeReservation;
	}

	public void setTypeReservation(String typeReservation) {
		this.typeReservation = typeReservation;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", confirmation=" + confirmation + ", nbrPlacetablesByIdReservation=" 
				+ ", apprenant=" + apprenant + "]";
	}



    
    
}
