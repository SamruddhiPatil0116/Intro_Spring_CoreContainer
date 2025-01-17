package com.prowings.core.circulardependency;


public class C {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of C-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of C-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "C [id=" + id + ", name=" + name + "]";
	}

}