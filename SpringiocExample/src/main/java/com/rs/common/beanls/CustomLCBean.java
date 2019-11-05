package com.rs.common.beanls;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomLCBean implements InitializingBean,DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public CustomLCBean() {
		System.out.println("Customer bean is called !!");
	}


	public  void printcustomLCBean() {
		System.out.println("name:"+name);

	}
	
	public void destroy() throws Exception {
		System.out.println("custom destroy method of bean is called !! ");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of bean is called !!");

	}
	public void init() throws Exception {
		System.out.println("custom Init method of bean is called !!");
	}
	public void printCustomLCBean() {
		System.out.println(name);
	}
}
