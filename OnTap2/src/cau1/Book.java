package cau1;

public class Book {
	private Integer id;
	private String name;
	private String publishing;
	public Book(Integer id, String name, String publishing) {
		
		this.id = id;
		this.name = name;
		this.publishing = publishing;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	
	
	
}
