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
    public static void main(String[] args) {


    ApplicationContext context = new ClassPathXmlApplicationContext("file:src/beans.xml");
    Movie movie = context.getBean("movie1", Movie.class);
    movie.actorInformation();

    BeanFactory factory = new FileSystemXmlApplicationContext("src/beans.xml");
    Movie movie1 = factory.getBean("movie2",Movie.class);
    movie1.actorInformation();

    BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
    reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
    Movie movie2 = ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie3",Movie.class);
    movie2.actorInformation();
}
}
