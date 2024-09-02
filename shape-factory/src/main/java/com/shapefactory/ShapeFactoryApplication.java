package com.shapefactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeFactoryApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Shape.xml");
		IShape rectangle = (IShape) context.getBean("rectangle");
		IShape triangle = (IShape) context.getBean("triangle");
		System.out.println(rectangle.getArea());
		System.out.println(triangle.getArea());
	}

}
