package com.klef.jfsd.exam1;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	
public class Inheritance {

		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			
			Device d = new Device();
			d.setId(7);
			d.setBrand("watch");
			d.setModel("xy");
			d.setPrice(1000);
			session.persist(d);

			Smartphone s = new Smartphone();
			s.setId(8);
			s.setBrand("water");
			s.setModel("bau");
			s.setPrice(80);
			s.setOs("Android");
			s.setCamerares(10);
			session.persist(s);

			Tablet t = new Tablet();
			t.setId(9);
			t.setBrand("braclet");
			t.setModel("T");
			t.setPrice(250);
			t.setBatterlife(8);
			t.setScreensize("8 inch");
			session.persist(t);

			
			System.out.println("SUCCESS......!!");
			
			
			
			transaction.commit();
			session.close();
			sf.close();
		}

}
