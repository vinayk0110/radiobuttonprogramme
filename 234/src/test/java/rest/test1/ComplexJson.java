package rest.test1;

import java.util.ArrayList;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class ComplexJson {

	public static void main(String[] args) 
	{
		ArrayList<String> Array = new ArrayList<String>();
		
		Array.add("c");
		Array.add("c");
		Array.add("c");

		
		

		
		
		

		Dashboard d = new Dashboard();
		
		d.setPurchaseAmount(1000);
		d.setWebsite("rahul.com");
		d.setCourses(Array);
		
		Response res = given().header("Content-Type","application/json").body(d).log().all().when().post("https://reqres.in/api/users");
		System.out.println(res);
		
		
	}
	

}
