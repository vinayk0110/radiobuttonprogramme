package rest.test1;

import java.util.List;

import org.json.simple.JSONObject;

public class Dashboard 
{

	
		private Integer purchaseAmount;
		public Integer getPurchaseAmount() {
			return purchaseAmount;
		}
		public void setPurchaseAmount(Integer purchaseAmount) {
			this.purchaseAmount = purchaseAmount;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public List<String> getCourses() {
			return courses;
		}
		public void setCourses(List<String> courses) {
			this.courses = courses;
		}
		private String website;
		private List<String> courses;;
		
		
		

	}

