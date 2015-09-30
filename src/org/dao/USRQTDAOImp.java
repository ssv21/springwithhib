package org.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.USRQT;

public class USRQTDAOImp implements USRQTDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void add(USRQT userqt) {
		sessionFactory.getCurrentSession().saveOrUpdate(userqt);
		
	}
	
}
