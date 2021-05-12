package vti.com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestHibernate {
	public static void main(String[] args) {
		// get session
		Session session = null;
		try {
			session = buildSessionFactory().openSession(); // lấy session ra 
			session.beginTransaction();
			
			// goi tu ben Testingcategory(đối tượng) sang để nhập vào //
			Testingcategory category = new Testingcategory();
			category.setName("Himbernate1"); // đây là chỗ nhập để đẩy lên database//

			session.save(category); // lưu lại //

			System.out.println("create success!");

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close(); // lệnh đóng 
			}
		}
	}

	private static SessionFactory buildSessionFactory() {
		// load configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // điềm đúng cái tên hibenate //
		
		// add entity // add thêm vào //
		configuration.addAnnotatedClass(Testingcategory.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
	}
}
