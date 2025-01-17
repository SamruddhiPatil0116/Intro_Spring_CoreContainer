package com.prowings.core.circulardependency;


public class A {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of A-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of A-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}

}