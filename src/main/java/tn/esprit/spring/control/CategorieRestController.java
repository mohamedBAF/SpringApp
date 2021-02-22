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

import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.service.ICategorieService;



@CrossOrigin(origins="http://localhost:3000")
@RestController   
public class CategorieRestController {
	
	@Autowired
	ICategorieService Categorieservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Categorie
	
		@GetMapping("/retrieve-all-Categorie")
		@ResponseBody
		public List<Categorie> getCategorie() {
		return Categorieservice.retrieveAllCategories();
		
		
	}
		
		
		// http://localhost:8081/SpringMVC/servlet/modify-Categorie
				@PutMapping("/modify-Categorie")
				@ResponseBody
				public Categorie modifyUser(@RequestBody Categorie Categorie) {
				return Categorieservice.updateCategorie(Categorie);
				}
				
				
		// http://localhost:8081/SpringMVC/servlet/retrieve-Categorie/{Categorie-id}
			@GetMapping("/retrieve-Categorie/{Categorie-id}")
			@ResponseBody
			public Categorie retrieveUser(@PathVariable("Categorie-id") String CategorieId) {
			return Categorieservice.retrieveCategorie(CategorieId);
			}
			
			// Ajouter Categorieee : http://localhost:8081/SpringMVC/servlet/add-Categorie
			
			@PostMapping("/add-Categorie")
			@ResponseBody
			public void addCategorie(@RequestBody Categorie p) {
			Categorie Categorie= Categorieservice.addCategorie(p);
			
			}
			
			
						
						
						
			
			// http://localhost:8081/SpringMVC/servlet/remove-Categorie/{Categorie-id}
			            
						@DeleteMapping("/remove-Categorie/{Categorie-id}")
						@ResponseBody
						public void deleteCategorie(@PathVariable("Categorie-id") long CategorieId) {
	
							Categorieservice.deleteCategorie(CategorieId);
						}
						
				
}
