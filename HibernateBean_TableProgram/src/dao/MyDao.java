package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.EmpBean;
import bean.EmpBeans;

public class MyDao {
	//for one bean two table
	/*public int insertEmp(EmpBean e)
	{   int x=0;
		
		SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tt=ss.beginTransaction();
		Object o=ss.save(e);
		if(o!=null)
			x=1;
		
		tt.commit();
		ss.close();
		return x;

	}*/
	//For two beans one table
	public int insertEmp(EmpBeans e)
	{   int x=0;
		
		SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tt=ss.beginTransaction();
		Object o=ss.save(e);
		if(o!=null)
			x=1;
		
		tt.commit();
		ss.close();
		return x;

	}

}
