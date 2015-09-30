package org.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.USERT;

public class USERTDAOImp implements USERTDAO{

	@Autowired
	private SessionFactory sessionFactory;
	public void add(USERT user) {
	sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	
}
