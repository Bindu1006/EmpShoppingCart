package com.sjsu.ad.DAO;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.ad.BO.CustomerInfoBO;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	
	private SessionFactory sessionFactory;
	private int appID;
	
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	

	@Override
	public CustomerInfoBO doLoginCustomer(CustomerInfoBO customerInfo) {
		System.out.println("In DAO class ::: Tester Authentication..");
		
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CustomerInfoBO.class);
		
		Criterion username = Restrictions.eq("customerUsername",customerInfo.getCustomerUsername()).ignoreCase();
        Criterion password = Restrictions.eq("customerPassword",customerInfo.getCustomerPassword());
        LogicalExpression Exp = Restrictions.and(username,password);
        criteria.add(Exp);
        CustomerInfoBO loggedCustomerDetails = (CustomerInfoBO) criteria.uniqueResult();
        session.getTransaction().commit();
        if (loggedCustomerDetails == null) {
        	System.out.println("Nulllll");
        	
        }
        return loggedCustomerDetails;
	}

	@Override
	public String registerCustomer(CustomerInfoBO customerDetails) {

		System.out.println("SAVE CUSTOMER DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		try {
		session.beginTransaction();
		
		session.save(customerDetails);
		session.getTransaction().commit();
		} catch(HibernateException e) {
			System.out.println(e);
			session.getTransaction().rollback();			
			result = "FAIL";
			return result;
			
		}
		return result;
	
	}
	
	

}
