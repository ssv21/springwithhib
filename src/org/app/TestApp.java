package org.app;

import org.dao.QuestionsDAOImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext  apcontext =new ClassPathXmlApplicationContext("resources/spring.xml");
		
		QuestionsDAOImp q  =(QuestionsDAOImp)apcontext.getBean("ques");
		
		q.add(ques);
		
	}

}
