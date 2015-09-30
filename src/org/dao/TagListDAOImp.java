package org.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.tables.TagList;

public class TagListDAOImp implements TagListDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void add(TagList tgl) {
		sessionFactory.getCurrentSession().saveOrUpdate(tgl);
	}

}
