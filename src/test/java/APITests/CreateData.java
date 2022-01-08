package MPokket.APITests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateData {
    
  @Test
  public void CreateEntry() {
	  RestAssured.baseURI= "http://dummy.restapiexample.com";
	  String response=given().log().all().header("Content-Type","application/json")
			  .body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}").when().post("create")
			  .then().assertThat().statusCode(200).statusCode(200).extract().response().asString();
	  
	  System.out.println(response);
  }
}
