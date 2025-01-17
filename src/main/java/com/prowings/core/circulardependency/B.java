package com.prowings.core.circulardependency;


public class B {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of B-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of B-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}
	
}