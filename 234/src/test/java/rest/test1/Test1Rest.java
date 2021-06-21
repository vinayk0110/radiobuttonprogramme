package rest.test1;

import static io.restassured.RestAssured.*;


import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.json.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class Test1Rest 
{
	public static String employee_salary = "200000";
	public static void main(String[] args)
	{
	 //given().log().all().when().get("http://dummy.restapiexample.com/api/v1/employee/1").then().statusCode(200).log().all().body("employee_age",equalTo("61"));
	 /*JSONObject j= new JSONObject();
	 j.put("id", "202");
	 j.put("employee_name", "vinay1");
	 j.put("employee_salary", "90000");
	 j.put("employee_age", "27");
	 j.put("profile_image", "");*/

	 
	 
	 //given().body(j.toJSONString()).when().post("http://dummy.restapiexample.com/api/v1/create").then().assertThat().log().all().body("message",equalTo("Successfully! Record has been added."));
	// given().log().all().when().get("http://demoqa.com/utilities/weather/city/Hyderabad").then().statusCode(200).log().all().body("Humidity",contains("184"));
	 //given().log().all().when().get("https://rahulshettyacademy.com/maps/api/place/get/json").then().log().all();
	 //given().log().all().when().put("http://dummy.restapiexample.com/api/v1/update/2").then().statusCode(200).log().all();
	 RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js=new JsonPath(response); //for parsing Json
		String placeId=js.getString("place_id");
		
		System.out.println("This is :"+placeId);
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId).header("Content-Type","application/json").when().get("maps/api/place/get/json").then().assertThat().log()
		.all()
		.statusCode(200).body("name", equalTo("Rahul Shetty Academy"));
		 /*String Ac = "100";
		 JSONObject j= new JSONObject();
		 j.put("accuracy", Ac);
		 j.put("name", "Rahul Shetty Academy");
	  given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(j.toJSONString()).when()
		.put("maps/api/place/update/json/0ee9763f9096b3901cdf74841570d449").then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));*/
String newAddress = "Summer Walk, Africa";
		JSONObject j= new JSONObject();
		j.put("accuracy", newAddress);
		j.put("place_id",placeId);
		j.put("Key", "qaclick123");
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(j.toJSONString()).
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	}

}
