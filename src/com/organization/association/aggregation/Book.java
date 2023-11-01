package com.organization.association.aggregation;

public class Book {
	
	private String tittle;
	private String auther;
	private String type;
	
	public Book() {
		super();
	}
	
	public Book(String tittle, String auther, String type) {
		super();
		this.tittle = tittle;
		this.auther = auther;
		this.type = type;
	}
	
	public String getTittle() {
		return tittle;
	}
	
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String getAuther() {
		return auther;
	}
	
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
