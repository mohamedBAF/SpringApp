package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "T_FOURNISSEUR")
public class Fournisseur implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String uid;
	public long getId() {
		return id;
	}




	public String getUid() {
		return uid;
	}




	public void setUid(String uid) {
		this.uid = uid;
	}




	public Fournisseur(long id, String uid, String nom, String prenom, int numtel, String adresse,
			List<Produit> produits) {
		super();
		this.id = id;
		this.uid = uid;
		this.nom = nom;
		this.prenom = prenom;
		this.numtel = numtel;
		this.adresse = adresse;
		this.produits = produits;
	}




	public Fournisseur() {
		super();
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getNumtel() {
		return numtel;
	}


	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	private String nom;
	private String prenom;
	private int numtel;
	private String adresse; 
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="fournisseur")
	@JsonBackReference
	private List<Produit> produits;


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


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
