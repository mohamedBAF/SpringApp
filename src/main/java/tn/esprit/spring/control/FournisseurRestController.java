package tn.esprit.spring.control;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.service.IFournisseurService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class FournisseurRestController {
	
	@Autowired
	IFournisseurService Fournisseurservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Fournisseur
		@GetMapping("/retrieve-all-Fournisseur")
		@ResponseBody
		public List<Fournisseur> getFournisseur() {
		return Fournisseurservice.retrieveAllFournisseurs();
		
		
	}
		
		
		
		
		// http://localhost:8081/SpringMVC/servlet/modify-Fournisseur/{Fournisseur-id}
				@PutMapping("/modify-Fournisseur/{Fournisseur-id}")
				@ResponseBody
				public Fournisseur modifyUser(@PathVariable("Fournisseur-id") String FournisseurId, @RequestBody Fournisseur Fournisseur) {
				Fournisseur p=	Fournisseurservice.retrieveFournisseur(FournisseurId);
			
			p.setNom(Fournisseur.getNom());
			p.setPrenom(Fournisseur.getPrenom());
			p.setNumtel(Fournisseur.getNumtel());
			p.setAdresse(Fournisseur.getAdresse());
				return Fournisseurservice.updateFournisseur(p);
				}
				
				
		// http://localhost:8081/SpringMVC/servlet/retrieve-Fournisseur/{Fournisseur-id}
			@GetMapping("/retrieve-Fournisseur/{Fournisseur-id}")
			@ResponseBody
			public Fournisseur retrieveUser(@PathVariable("Fournisseur-id") String FournisseurId) {
			return Fournisseurservice.retrieveFournisseur(FournisseurId);
			}
			
			// Ajouter Fournisseur : http://localhost:8081/SpringMVC/servlet/add-Fournisseur
			@PostMapping("/add-Fournisseur")
			@ResponseBody
			public void addFournisseur(@RequestBody Fournisseur p) {
			
			Fournisseur Fournisseur= Fournisseurservice.addFournisseur(p);
			
			}
			
			
						
						
						
			
			// http://localhost:8081/SpringMVC/servlet/remove-Fournisseur/{Fournisseur-id}
						@DeleteMapping("/remove-Fournisseur/{Fournisseur-id}")
						@ResponseBody
						public void deleteFournisseur(@PathVariable("Fournisseur-id") long FournisseurId) {
	
							Fournisseurservice.deleteFournisseur(FournisseurId);
						}
						
				
}
