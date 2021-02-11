package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Produit;

public interface IProduitService { 
	
	
	
	
	List<Produit> retrieveAllProduits(); 
	Produit addProduit(Produit u); 
	Produit updateProduit(Produit u);
	Produit retrieveProduit(String id);
	void deleteProduit(long id);
//	List<Produit> retrieveAllProduits(); 
//
//	Produit addProduit(Produit u);
//
//	void deleteProduit(String id);
//
//	Produit updateProduit(Produit u);
//
//
//	String hello(String msg);
//
//	int calcuerSomme(int i, int j);
//
//	int calcuerDiff(int i, int j);
//	 
} 
 