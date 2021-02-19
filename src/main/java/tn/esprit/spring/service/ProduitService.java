package tn.esprit.spring.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ProduitRepository;



@Service
public class ProduitService implements IProduitService {

	@Autowired
	ProduitRepository ProduitRepository;
	
	
	
	
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits=(List<Produit>)ProduitRepository.findAll();
		
		return produits;
	}
//ajoutt
	@Override
	public Produit addProduit(Produit e) {
		e.setDateInsertion(new Timestamp(System.currentTimeMillis()));
		return ProduitRepository.save(e);
	}
	
	@Override
	public Produit updateProduit(Produit p) {
		return ProduitRepository.save(p);
	}
	
	@Override
	public Produit retrieveProduit(String id) {
		// Optional retrun type - Java 8 (susceptible de retourner des valeurs «
		// vides » et pas null)
		Produit p =  ProduitRepository.findById(Long.parseLong(id)).orElse(null);
		//User u =  userRepository.findById(Long.parseLong(id)).get(); 
		
		return p; 
	}
	
	
	@Override
	public void deleteProduit(long id) {
		ProduitRepository.deleteById(id);
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
//	public List<Produit> retrieveAllUsers() {
//		
//		
//		List<Produit> users = (List<Produit>) userRepository.findAll();  
//		for (Produit user : users) {
//			l.info("user +++ : " + user);
//		}
//		return users;
//	}
//
//	@Override
//	public Produit addUser(Produit u) {
//		return userRepository.save(u);
//	}
//
//	@Override
//	public User updateProduit(User u) {
//		return ProduitRepository.save(u);
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
