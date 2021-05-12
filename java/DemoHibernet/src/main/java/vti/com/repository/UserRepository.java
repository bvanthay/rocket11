package vti.com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import vti.com.entity.User;

public class UserRepository {

	private HibernateUtils hibernateUtils;

	public UserRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<User> query = session.createQuery("FROM User");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public User getUserByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get User by id
			User User = session.get(User.class, id);

			return User;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public User getUserByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<User> query = session.createQuery("FROM User WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			User User = query.uniqueResult();

			return User;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createUser(User User) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(User);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateUser(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get User
//			User User = (User) session.load(User.class, id);
//
//			// update
//			User.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateUser(User User) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(User);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteUser(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get User
			User User = (User) session.load(User.class, id);

			// delete
			session.delete(User);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isUserExistsByID(short id) {

		// get User
		User User = getUserByID(id);

		// return result
		if (User == null) {
			return false;
		}

		return true;
	}

	public boolean isUserExistsByName(String name) {
		User User = getUserByName(name);

		if (User == null) {
			return false;
		}
		return true;
	}

}
