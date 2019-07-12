package com.stackroute.domain;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args)
    {


    ApplicationContext context = new ClassPathXmlApplicationContext("file:src/beans.xml");
    Movie movie = context.getBean("movie", Movie.class);
    movie.actorInformation();


        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.actorInformation();


    }
}
