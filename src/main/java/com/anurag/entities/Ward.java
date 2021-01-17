package com.anurag.entities;



public class Ward {

	    //its not entity its only class  to store the count
 
	private int id;
	 private int ward1; //no. of ward1 count
	  private int ward2; // no. of ward2 count
	  private int ward3;  //no.of ward 3 count
	  
	  
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWard1() {
		return ward1;
	}
	public void setWard1(int ward1) {
		this.ward1 = ward1;
	}
	public int getWard2() {
		return ward2;
	}
	public void setWard2(int ward2) {
		this.ward2 = ward2;
	}
	public int getWard3() {
		return ward3;
	}
	public void setWard3(int ward3) {
		this.ward3 = ward3;
	}
	public Ward() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ward(int id, int ward1, int ward2, int ward3) {
		super();
		this.id = id;
		this.ward1 = ward1;
		this.ward2 = ward2;
		this.ward3 = ward3;
	}
	
	
	
	  
	  

}
