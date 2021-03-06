package vti.com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import vti.com.entity.Group;

public class GroupRepository {

	private HibernateUtils hibernateUtils;

	public GroupRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Group> getAllGroups() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Group> query = session.createQuery("FROM Group");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Group getGroupByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Group by id
			Group Group = session.get(Group.class, id);

			return Group;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Group getGroupByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Group> query = session.createQuery("FROM Group WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Group Group = query.uniqueResult();

			return Group;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createGroup(Group Group) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Group);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateGroup(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Group
			Group Group = (Group) session.load(Group.class, id);

			// update
			Group.setName(newName);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateGroup(Group Group) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Group);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteGroup(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Group
			Group Group = (Group) session.load(Group.class, id);

			// delete
			session.delete(Group);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isGroupExistsByID(short id) {

		// get Group
		Group Group = getGroupByID(id);

		// return result
		if (Group == null) {
			return false;
		}

		return true;
	}

	public boolean isGroupExistsByName(String name) {
		Group Group = getGroupByName(name);

		if (Group == null) {
			return false;
		}
		return true;
	}

}
