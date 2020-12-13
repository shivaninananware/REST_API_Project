package com.OwnerRestController;
import  static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;




public class Owner_Controller_POST {
	
	@Test
	public void test_02() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(new File(".\\jsonInputFolder\\jsonPostRequest.json "));
		baseURI = "http://api.e46708b92c054086909b.eastus.aksapp.io/petclinic";
		
		
		           
		given()
				.header("Content-Type","application/json")
				  
					.and()
				  
					.body(fileInputStream)  //pass the object of  json file to body
				  
					.when()
				
				.post("/api/pettypes")
					
					.then().statusCode(201)
					
					.and()
				
				.log().all();
		
	}
	

}
