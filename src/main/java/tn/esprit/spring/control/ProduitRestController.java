package tn.esprit.spring.control;

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

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.IProduitService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProduitRestController {
	
	@Autowired
	IProduitService produitservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-produittt
		@GetMapping("/retrieve-all-produit")
		@ResponseBody
		public List<Produit> getProduit() {
		return produitservice.retrieveAllProduits();
		
		
	}
		
		
		
		
		// http://localhost:8081/SpringMVC/servlet/modify-produit/{produit-id}
				@PutMapping("/modify-produit/{produit-id}")
				@ResponseBody
				public Produit modifyProduit(@PathVariable("produit-id") String produitId, @RequestBody Produit produit) {
					
			Produit p=	produitservice.retrieveProduit(produitId);
			
			p.setNom(produit.getNom());
			p.setQuantite(produit.getQuantite());
			p.setTva(produit.getTva());
				return produitservice.updateProduit(p);
				}
				
				
		// http://localhost:8081/SpringMVC/servlet/retrieve-produit/{produit-id}
			@GetMapping("/retrieve-produit/{produit-id}")
			@ResponseBody
			public Produit retrieveUser(@PathVariable("produit-id") String produitId) {
			return produitservice.retrieveProduit(produitId);
			}
			
			// Ajouter Produit : http://localhost:8081/SpringMVC/servlet/add-produit
			@PostMapping("/add-produit")
			@ResponseBody
			public void addproduit(@RequestBody Produit p) {
			
			Produit produit= produitservice.addProduit(p);
			
			}
			
			
						
						
						
			
			// http://localhost:8081/SpringMVC/servlet/remove-produit/{produit-id}
						@DeleteMapping("/remove-produit/{produit-id}")
						@ResponseBody
						public void deleteProduit(@PathVariable("produit-id") long produitId) {
	
							produitservice.deleteProduit(produitId);
						}
						
				
}
