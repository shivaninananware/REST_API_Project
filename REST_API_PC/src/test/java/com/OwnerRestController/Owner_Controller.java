package com.OwnerRestController;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Owner_Controller {
	
	
	@Test
	public void test_01() {
		
		baseURI = "http://api.e46708b92c054086909b.eastus.aksapp.io/petclinic";
		
		given().
		
					get("/api/pettypes").  //Get the  details
		
					then().statusCode(200).
		
					body("id[5]",equalTo(14)). //validate the ID at specified index
		
				log().all();
		 
}
	
	
}
