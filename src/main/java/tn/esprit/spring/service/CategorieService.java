package tn.esprit.spring.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.repository.CategorieRepository;



@Service
public class CategorieService implements ICategorieService {

	@Autowired
	CategorieRepository CategorieRepository;
	
	
	
	
	@Override
	public List<Categorie> retrieveAllCategories() {
		List<Categorie> Categories=(List<Categorie>)CategorieRepository.findAll();
		
		return Categories;
	}

	@Override
	public Categorie addCategorie(Categorie e) {
		
		return CategorieRepository.save(e);
	}
	
	@Override
	public Categorie updateCategorie(Categorie p) {
		return CategorieRepository.save(p);
	}
	
	@Override
	public Categorie retrieveCategorie(String id) {
		// Optional retrun type - Java 8 (susceptible de retourner des valeurs «
		// vides » et pas null)
		Categorie p =  CategorieRepository.findById(Long.parseLong(id)).orElse(null);
		//User u =  userRepository.findById(Long.parseLong(id)).get(); 
		
		return p; 
	}
	
	
	@Override
	public void deleteCategorie(long id) {
		CategorieRepository.deleteById(id);
}
	
	
//	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
//
//
//	@Override 
//	public String hello(String msg) { 
//		try { Thread.sleep(200); } catch ( InterruptedException e )	{e.printStackTrace();}  
//		return "Bonjour Esprit " + msg; 
//	} 
//
//	@Override 
//	public int calcuerSomme(int i, int j) { int k = i + j; return k; }
//
//
//	@Override 
//	public int calcuerDiff(int i, int j) { int k = i - j; return k; }
//
// 
//	@Override
//	public List<Categorie> retrieveAllUsers() {
//		
//		
//		List<Categorie> users = (List<Categorie>) userRepository.findAll();  
//		for (Categorie user : users) {
//			l.info("user +++ : " + user);
//		}
//		return users;
//	}
//
//	@Override
//	public Categorie addUser(Categorie u) {
//		return userRepository.save(u);
//	}
//
//	@Override
//	public User updateCategorie(User u) {
//		return CategorieRepository.save(u);
//	}
//
//	@Override
//	public void deleteUser(String id) {
//		userRepository.deleteById(Long.parseLong(id));
//	}
//
//	@Override
//	public User retrieveUser(String id) {
//		// Optional retrun type - Java 8 (susceptible de retourner des valeurs «
//		// vides » et pas null)
//		User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
//		//User u =  userRepository.findById(Long.parseLong(id)).get(); 
//		l.info("user returned : " + u);
//		return u; 
//	}
//
//


}
