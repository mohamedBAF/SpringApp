package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Fournisseur;

public interface IFournisseurService { 
	
	
	
	
	List<Fournisseur> retrieveAllFournisseurs(); 
	Fournisseur addFournisseur(Fournisseur u); 
	Fournisseur updateFournisseur(Fournisseur u);
	Fournisseur retrieveFournisseur(String id);
	void deleteFournisseur(long id);
//	List<Fournisseur> retrieveAllFournisseurs(); 
//
//	Fournisseur addFournisseur(Fournisseur u);
//
//	void deleteFournisseur(String id);
//
//	Fournisseur updateFournisseur(Fournisseur u);
//
//
//	String hello(String msg);
//
//	int calcuerSomme(int i, int j);
//
//	int calcuerDiff(int i, int j);
//	 
} 
 