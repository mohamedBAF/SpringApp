package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Categorie;

public interface ICategorieService { 
	
	
	
	
	List<Categorie> retrieveAllCategories(); 
	Categorie addCategorie(Categorie u); 
	Categorie updateCategorie(Categorie u);
	Categorie retrieveCategorie(String id);
	void deleteCategorie(long id);
//	List<Categorie> retrieveAllCategories(); 
//
//	Categorie addCategorie(Categorie u);
//
//	void deleteCategorie(String id);
//
//	Categorie updateCategorie(Categorie u);
//
//
//	String hello(String msg);
//
//	int calcuerSomme(int i, int j);
//
//	int calcuerDiff(int i, int j);
//	 
} 
 