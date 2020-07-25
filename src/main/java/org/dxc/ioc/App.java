package org.dxc.ioc;

import org.dxc.ioc.model.Car;
import org.dxc.ioc.model.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\ss692\\dxc- workspace-spring\\springcore\\src\\main\\java\\org\\dxc\\ioc\\App.java");//usually used to specify full address
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
		// Student student1 = new Student();

		Car car = applicationContext.getBean(Car.class);
		System.out.println(car.getModel());
		System.out.println(car.getYears());
		System.out.println(car.getColour());
		System.out.println(car.getDriver().getDname());
	}
}
