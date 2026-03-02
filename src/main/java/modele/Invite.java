package modele;

import jakarta.persistence.*;
import java.io.Serializable;
import java.lang.String;
import java.sql.Date;

/**
 * Entity implementation class for Entity: Invite
 *
 */
@Entity

public class Invite implements Serializable {

	   
	@Id
	private long id;
	private String nom;
	private String prenom;
	private Date date;
	private static final long serialVersionUID = 1L;

	public Invite() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
