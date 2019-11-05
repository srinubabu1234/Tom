package com.rs.common.beanls;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Logic {
	public static void main(String[] args) {
		//Resource resource = new ClassPathResource("Bean.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		//BeanFactory factory = new XmlBeanFactory(resource);

		
		// CustomLCBean CustomLCBean = (CustomLCBean) factory.getBean("CustomLCBean");
		 //CustomLCBean.printCustomLCBean();
		/*
		 * PersonBean personBean = (PersonBean) factory.getBean("PersonBean");
		 * personBean.printPersonBean();
		 */
		
		  CustomLCBean customLCBean=(CustomLCBean) context.getBean("CustomLCBean",CustomLCBean.class);
		  System.out.println(customLCBean.hashCode());
		  context.close();
	}
}
