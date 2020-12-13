package com.OwnerRestController;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Owner_Controller_DELETE {
	
	@Test
	public void test_03() {
		
		
		
		baseURI = "http://api.e46708b92c054086909b.eastus.aksapp.io/petclinic";
		
		
		
		given()
		
			.header("Content-Type","application/json")
		
			.when()
		
		
			.delete("/api/pettypes/2") //delete the pet type passed with ID 
		
			.then()
			
			.statusCode(204)     //204 is successful deletion
			
		.log().all();
		
		
		
		
			
		 
}

}
