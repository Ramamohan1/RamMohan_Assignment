package MPokket.APITests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteData {
	@Test 
	public void DeleteEmployeeData() {
		  RestAssured.baseURI= "http://dummy.restapiexample.com";
		  String response=given().log().all().header("Content-Type","application/json")
				  .when().delete("public/api/v1/delete/2")
				  .then().assertThat().statusCode(200).statusCode(200).extract().response().asString();		  
		  System.out.println(response);
	  }
}
