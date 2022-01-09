package com.technoelevate.springAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
    	Salary bean = container.getBean(Salary.class);
    	System.out.println(bean);
    }
}
