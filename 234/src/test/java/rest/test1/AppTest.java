package rest.test1;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;



/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
    	//RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
    	/*Response res = given().log().all() .when().get("/employee/1").then().assertThat().log().all().
        statusCode(200).extract().response();
        */
    	given().log().all().when().get().then().assertThat().statusCode(200).extract().response().as(serialization.class);
    	
    	//System.out.println(res);
    	
    
    	/*JsonPath js = res.jsonPath();
    	String trans = js.get("employee_name");
    	System.out.println(trans);
*/
    }
}