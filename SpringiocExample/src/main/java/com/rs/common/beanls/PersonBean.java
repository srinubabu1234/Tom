package com.rs.common.beanls;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonBean implements InitializingBean, DisposableBean{

	private static String name;
	PersonBean(String name){
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PersonBean() {
		System.out.println("Constructor of Person Bean is called !!");
	}
	public void destroy() throws Exception {
		System.out.println("destroy of Person Bean is called !!");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet of Person Bean is called !!");

	}

	public static void printPersonBean() {
		System.out.println(name);
	}
	
}
