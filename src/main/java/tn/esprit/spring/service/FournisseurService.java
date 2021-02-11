package tn.esprit.spring.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;



@Service
public class FournisseurService implements IFournisseurService {

	@Autowired
	FournisseurRepository FournisseurRepository;
	
	
	
	
	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		List<Fournisseur> Fournisseurs=(List<Fournisseur>)FournisseurRepository.findAll();
		
		return Fournisseurs;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur e) {
		
		return FournisseurRepository.save(e);
	}
	
	@Override
	public Fournisseur updateFournisseur(Fournisseur p) {
		return FournisseurRepository.save(p);
	}
	
	@Override
	public Fournisseur retrieveFournisseur(String id) {
		// Optional retrun type - Java 8 (susceptible de retourner des valeurs «
		// vides » et pas null)
		Fournisseur p =  FournisseurRepository.findById(Long.parseLong(id)).orElse(null);
		//User u =  userRepository.findById(Long.parseLong(id)).get(); 
		
		return p; 
	}
	
	
	@Override
	public void deleteFournisseur(long id) {
		FournisseurRepository.deleteById(id);
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
//	public List<Fournisseur> retrieveAllUsers() {
//		
//		
//		List<Fournisseur> users = (List<Fournisseur>) userRepository.findAll();  
//		for (Fournisseur user : users) {
//			l.info("user +++ : " + user);
//		}
//		return users;
//	}
//
//	@Override
//	public Fournisseur addUser(Fournisseur u) {
//		return userRepository.save(u);
//	}
//
//	@Override
//	public User updateFournisseur(User u) {
//		return FournisseurRepository.save(u);
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
