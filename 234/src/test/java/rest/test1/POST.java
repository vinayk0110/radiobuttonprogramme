package rest.test1;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class POST 
{
	public static void main(String[] args)
	{
	RestAssured.baseURI= "https://reqres.in";
	//RestAssured.basePath = "/api/users?page=2";
	/*
	 
	 given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(j.toString()).when()
	.put().then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));*/
	
	/*JSONObject js = new JSONObject();
	js.put("page", 1);
	js.put("per_page", 6);
	js.put("total", 10);
	js.put("total_pages", 2);
	
	JSONArray json = new JSONArray();
	
	json.put(10);
	json.put("vinay@reqres.in");
	json.put("suvon");
	json.put("buth");
	json.put("https://reqres.in/img/faces/1-image.jpg");
	
	js.put("data",json);

	String res =	given().log().all().body(js.toString()).when().post("api/users").then().log().all().statusCode(201).extract().response().asString();
	JsonPath jj = new JsonPath(res);
	String ID = jj.getString("id");
	System.out.println(ID);*/
	String  res1 = given().log().all().when().get("api/users?page=1").then().log().all().assertThat().statusCode(200).extract().response().asString();
	JsonPath ji = new JsonPath(res1);
	String I = ji.getString("email");
		System.out.println(I);
		/*JsonPath j = new JsonPath(res);
		String response = j.getString("data[0].email");
		System.err.println(response);
		Assert.assertTrue(response.equalsIgnoreCase("george.bluth@reqres.in"),response);*/
}
}