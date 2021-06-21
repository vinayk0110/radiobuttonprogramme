package rest.test2;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.response.Response;
import rest.test2.Courses.API;
import rest.test2.Courses.WebAutomation;

public class GetRest 
{
  public static void main(String[] args)
  {
	   
	 ArrayList<WebAutomation> a = new ArrayList<WebAutomation>();
	  Courses.WebAutomation sel = new Courses.WebAutomation();
	  sel.setBook("Selenium");
	  sel.setPrice("500");
	  
	  a.add(sel);
	  
		 ArrayList<API> api = new ArrayList<API>();
		 Courses.API res = new Courses.API();
		 res.setBook("RestAssured");
		 res.setPrice("600");
		 
		 api.add(res);
	  
		 Courses c = new Courses();
		 c.setWebAutomation(a);
		 c.setAPI(api);
	  
	  
		 Rest r = new Rest();
		 r.setPurchaseamount("100");
		 r.setArea("100");
		
		 r.setCourses(c);
	  
	  Response response = given().header("Content-Type","application/json").body(r).log().all().when().post("https://reqres.in/api/users");
		System.out.println(response);
		
		List<API> ap = r.getCourses().getAPI();
		for(int i=0;i<ap.size();i++)
		{
			if(ap.get(i).getBook().equalsIgnoreCase("RestAssured"));
			System.out.println(ap.get(i).getPrice());
		}
		
  }
}
