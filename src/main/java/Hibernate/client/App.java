package Hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import Hibernate.entity.Employee;
//import Hibernate.util.HibernateConfig;
import Hibernate.util.HibernateConfig;

public class App {

	public static void main(String[] args) {
		Employee vikas = new Employee();
//		vikas.setId(5);
		vikas.setName("Noida");
		vikas.setGender("Male");
		vikas.setSalary(2000000);
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();		
		
		
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Employee e = session.get(Employee.class, 4);
//		System.out.println(e);
		session.save(vikas);
		tx.commit();
		
	}

}
