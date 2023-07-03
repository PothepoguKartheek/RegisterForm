package com.Register.Service.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Register.Entity.RegisterEntity;


@Repository
public class RegisterRepository {
	
	@Autowired
	private SessionFactory factory;
	
	public void saveUser(RegisterEntity entity)
	{
		try {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
