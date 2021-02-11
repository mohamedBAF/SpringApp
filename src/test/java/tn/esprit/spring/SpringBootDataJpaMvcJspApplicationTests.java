package tn.esprit.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.service.IProduitService;





@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaMvcJspApplicationTests {

	@Autowired 
	IProduitService up; 

	@Test
	public void testHello() throws ParseException {
//		up.hello("Mourad"); 
	}
	
	
	
/*	@Test
	public void testAddUser() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		User u = new User("Mayssa1", "Mayssa1", d, Role.STUDENT); 
		us.addUser(u); 
	}*/
//	
//	@Test
//	public void testModifyUser() throws ParseException   {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = dateFormat.parse("2015-03-23");
//		User u = new User(2L, "Mayssa", "Mayssa", d, Role.STUDENT); 
//		us.updateUser(u); 
//}
//
//	@Test
//	public void testRetrieveAllUsers() {
//		us.retrieveAllUsers(); 
//	}
//
//	@Test
//	public void testRetrieveUser() {
//		us.retrieveUser("4"); 
//	}
	
	// LocalDate représente une date au format ISO (aaaa-MM-jj) sans heure .
	// LocalDate date = LocalDate.parse("2018-02-13"); 

	//  LocalDateTime currentTime = LocalDateTime.now();
	//  System.out.println("Date et heure courante : " + currentTime);
	//		
	//  LocalDate date1 = currentTime.toLocalDate();
	//  System.out.println("Date courante : " + date1);
	//
	//  //Avoir le 25 décembre 2023
	//  LocalDateTime date2 = currentTime.withDayOfMonth(25).withYear(2023).withMonth(12);
	//  System.out.println("Date modifiée : " + date2);

}





