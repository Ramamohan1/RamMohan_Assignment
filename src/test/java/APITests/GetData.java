package MPokket.APITests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
 
 public class GetData {
	@Test 
	public void GetEmployeeData() {
		  RestAssured.baseURI= "http://dummy.restapiexample.com";
		  String response=given().log().all().header("Content-Type","application/json")
				  .when().get("api/v1/employees")
				  .then().assertThat().statusCode(200).extract().response().asString();
		  
		  System.out.println(response);
	  }
}
