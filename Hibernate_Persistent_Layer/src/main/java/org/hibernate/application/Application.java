package org.hibernate.application;

import org.hibernate.Session;
import org.hibernate.config.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		
		/*Create configuration 
		
		Configuration configuration=new Configuration();
		
		configuration.addAnnotatedClass(User.class);
		
		configuration.setProperties(new Properties(){
			{
			put("hibernate.connection.username","root");
			put("hibernate.connection.password","Yawyaw1990");
			put("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
			put("hibernate.connection.url","jdbc:mysql://localhost:3306/revision");
			
			put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
			put("hbm2dll.auto","create");
			put("show_sql","true");
			
			}
		});*/
		
		/*Create Session Factory
		
		SessionFactory factory=configuration
						.buildSessionFactory(new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties())
						.build());
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		User user=new User();
		user.setFirstname("firstname1");
		user.setLastname("lastname1");
		user.setLogin("login1");
		
		session.save(user);
		
		session.beginTransaction().commit();
		
		session.close();
		
		
		*/
		
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.close();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
