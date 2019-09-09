package edu.bit.ex.vo;

public class Tvo {
	private String id;
	private String name;
	private String title;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Tvo [id=" + id + ", name=" + name + ", title=" + title + "]";
	}
	
	
}

