package rest.test2;

import java.util.List;

public class Courses
{
	private List<WebAutomation> WebAutomation;
	private List<API> API;
	
	public static class WebAutomation
	
	{
		private String price;
		private String book;

		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getBook() {
			return book;
		}
		public void setBook(String book) {
			this.book = book;
		}
		
		
	}
	public static class API
	
	{
		private String price;
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getBook() {
			return book;
		}
		public void setBook(String book) {
			this.book = book;
		}
		private String book;
	}

	public List<WebAutomation> getWebAutomation() {
		return WebAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		WebAutomation = webAutomation;
	}
	public List<API> getAPI() {
		return API;
	}
	public void setAPI(List<API> API) {
		this.API = API;
	}



	
}
