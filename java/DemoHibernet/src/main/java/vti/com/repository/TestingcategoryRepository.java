package vti.com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import vti.com.entity.Testingcategory;

public class TestingcategoryRepository {

	private HibernateUtils hibernateUtils;

	public TestingcategoryRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Testingcategory> getAllTestingcategorys() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Testingcategory> query = session.createQuery("FROM Testingcategory");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Testingcategory getTestingcategoryByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Testingcategory by id
			Testingcategory Testingcategory = session.get(Testingcategory.class, id);

			return Testingcategory;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Testingcategory getTestingcategoryByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Testingcategory> query = session.createQuery("FROM Testingcategory WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Testingcategory Testingcategory = query.uniqueResult();

			return Testingcategory;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createTestingcategory(Testingcategory Testingcategory) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Testingcategory);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateTestingcategory(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Testingcategory
			Testingcategory Testingcategory = (Testingcategory) session.load(Testingcategory.class, id);

			// update
			Testingcategory.setName(newName);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateTestingcategory(Testingcategory Testingcategory) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Testingcategory);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteTestingcategory(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Testingcategory
			Testingcategory Testingcategory = (Testingcategory) session.load(Testingcategory.class, id);

			// delete
			session.delete(Testingcategory);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isTestingcategoryExistsByID(short id) {

		// get Testingcategory
		Testingcategory Testingcategory = getTestingcategoryByID(id);

		// return result
		if (Testingcategory == null) {
			return false;
		}

		return true;
	}

	public boolean isTestingcategoryExistsByName(String name) {
		Testingcategory Testingcategory = getTestingcategoryByName(name);

		if (Testingcategory == null) {
			return false;
		}
		return true;
	}

}
