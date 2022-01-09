package com.technoelevate.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new ClassPathXmlApplicationContext("Config.xml");
       // Car bean = (Car)container.getBean("car");
        Car bean = container.getBean(Car.class);
        bean.move();
    }
}
