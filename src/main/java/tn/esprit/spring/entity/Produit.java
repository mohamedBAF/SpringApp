package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "T_PRODUIT")
public class Produit implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 
	
	private String nom ; 
	private int quantite;
	private float tva ;

	
	private Timestamp dateInsertion;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}





	public Produit(long id, String nom, int quantite, float tva, Timestamp dateInsertion, Categorie categorie,
			Fournisseur fournisseur) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
		this.tva = tva;
		this.dateInsertion = dateInsertion;
		this.categorie = categorie;
		this.fournisseur = fournisseur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produit() {
		super();
	}


	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public Timestamp getDateInsertion() {
		return dateInsertion;
	}

	public void setDateInsertion(Timestamp dateInsertion) {
		this.dateInsertion = dateInsertion;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@ManyToOne
	Categorie categorie;
	
	@ManyToOne
	Fournisseur fournisseur;

}
