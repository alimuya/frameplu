package com.alimuya.frameplu.core.auth;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author alimuya
 * @date 2015年12月2日 下午11:05:11 
 */
@Repository
public class UserNamePasswordDao {
	@Autowired
	private  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getSession (){
		return this.sessionFactory.getCurrentSession();
	}
	
	UserNamePasswordPO loadByUsername(String username){
		Session session = this.getSession();
		Criteria c = session.createCriteria(UserNamePasswordPO.class);
		c.add(Restrictions.eq("username", username));
		List<UserNamePasswordPO> results = c.list();
		if (results.isEmpty()) {
			return null;
		} else {
			return results.get(0);
		}
	} 
	
	UserNamePasswordPO loadByUid(Long uid){
		return (UserNamePasswordPO) getSession().get(UserNamePasswordPO.class, uid);
	} 

}
