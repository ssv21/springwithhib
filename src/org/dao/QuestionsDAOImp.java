package org.dao;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.Answers;
import org.tables.Questions;

public class QuestionsDAOImp implements QuestionsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void add(Questions ques) {
		ques.setEff_date(new Date());
		ques.setId(1);
		ques.setExp_date(new Date());
		ques.setTdate(new Timestamp(2));
		ques.setTedate(null);
		String s="java is a open source";
		ques.set
		sessionFactory.getCurrentSession().saveOrUpdate(ques);
		
	}

}