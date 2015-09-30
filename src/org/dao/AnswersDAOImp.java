package org.dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.Answers;

public class AnswersDAOImp implements AnswersDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Answers ans) {
		ans.setEff_date(new Date());
		sessionFactory.getCurrentSession().saveOrUpdate(ans);
	}

}
