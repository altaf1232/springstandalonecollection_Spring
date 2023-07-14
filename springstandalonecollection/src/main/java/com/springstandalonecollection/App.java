package com.springstandalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
            ApplicationContext context=new ClassPathXmlApplicationContext("com/springstandalonecollection/stand.xml");
            Person person1=(Person)context.getBean("person1",Person.class);
            System.out.println(person1);
            //here is strated your first properties
            System.out.println(person1.getFrinds().getClass().getName());
            //here is strated your second properties
            System.out.println(person1.getFeestructure());
            System.out.println(person1.getFeestructure().getClass());
            //here is strated your third properties
            System.out.println(person1.getProperties());
            //properties used karne ya fida huga ki aap key xml file ma sari configuration rahegi aauur
            //aap key class file configuration nahi rahegi 
            
    }
}
