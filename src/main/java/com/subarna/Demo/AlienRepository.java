package com.subarna.Demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mysql.cj.Session;


public class AlienRepository {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
			addAnnotatedClass(Alien.class).buildSessionFactory();
	
	
	
public AlienRepository() {

}
public <Alien>ArrayList getAliens()

{
	org.hibernate.Session session=factory.getCurrentSession();
	session.beginTransaction();
	ArrayList<Alien> al= (ArrayList<Alien>) session.createQuery("from aliens").getResultList();
	return al;
}

public void create(com.subarna.Demo.Alien a1) {
	// TODO Auto-generated method stub
	org.hibernate.Session session=factory.getCurrentSession();
	session.beginTransaction();
	session.save(a1);
	session.getTransaction().commit();
	
}
public com.subarna.Demo.Alien getAlien(int id) {
	// TODO Auto-generated method stub
	Alien a1= new Alien();
	org.hibernate.Session session=factory.getCurrentSession();
	session.beginTransaction();
	a1=(Alien)session.get(Alien.class, id);
	session.getTransaction().commit();
	return a1;
}
public com.subarna.Demo.Alien update(com.subarna.Demo.Alien a1, int id) {
	// TODO Auto-generated method stub

	org.hibernate.Session session=factory.getCurrentSession();
	session.beginTransaction();
	session.update(a1);
	session.getTransaction().commit();
	return a1;
}

}


