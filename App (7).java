package com.technoelevate.springbean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.springbeanclass.Config;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Pet pet = container.getBean(Pet.class);
        pet.doThings();
    }
}
