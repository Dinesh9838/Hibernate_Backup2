package Hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfig {

	public static SessionFactory getSessionFactory() {
		Properties ps = new Properties();

		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put(Environment.URL, "jdbc:mysql://localhost:3306/micro");
		ps.put("hibernate.connection.username", "root");
		ps.put("hibernate.connection.password", "Dinesh@123");
		ps.put(Environment.SHOW_SQL, "true");
		ps.put(Environment.FORMAT_SQL, "true");
//		ps.put(Environment.HBM2DDL_AUTO, "update");
		ps.put(Environment.HBM2DDL_AUTO, "create");

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(ps).build();
		// Create a MetadataSources and add annotated entity classes
		MetadataSources metadataSources = new MetadataSources(ssr).addAnnotatedClass(Hibernate.entity.Employee.class);
		Metadata meta = metadataSources.buildMetadata();
		// Create a SessionFactory
		SessionFactory sessionFactory = meta.buildSessionFactory();

		return sessionFactory;

	}
}
