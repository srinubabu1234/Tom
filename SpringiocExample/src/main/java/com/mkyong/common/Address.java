package com.mkyong.common;


public class Address {
	private int id;
	private String area;
	private String userId;
	
	Address(int id,String area,String userId){
		this.id =id;
		this.area =area;
		this.userId =userId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void printAddress() {
		System.out.println("id: "+id+",area: "+area+" and userId: "+userId);
	}
}
