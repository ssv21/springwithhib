package org.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.TWQSN;

public class TWQSNDAOImpl implements TWQSNDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void add(TWQSN tw) {
		sessionFactory.getCurrentSession().saveOrUpdate(tw);
	}
}
