package rest.test1;

import java.util.List;

public class Courses
{
	private List<Courses> courses;
	

	public List<Courses> getCourses() {
		return courses;
	}


	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}


	
		private String title;
		private Integer price;
		private Integer copies;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public Integer getCopies() {
			return copies;
		}
		public void setCopies(Integer copies) {
			this.copies = copies;
		}


	
	
}
