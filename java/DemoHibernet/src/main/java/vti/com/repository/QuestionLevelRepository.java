package vti.com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import vti.com.entity.QuestionLevel;

public class QuestionLevelRepository {

	private HibernateUtils hibernateUtils;

	public QuestionLevelRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<QuestionLevel> getAllQuestionLevels() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<QuestionLevel> query = session.createQuery("FROM QuestionLevel");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public QuestionLevel getQuestionLevelByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get QuestionLevel by id
			QuestionLevel QuestionLevel = session.get(QuestionLevel.class, id);

			return QuestionLevel;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public QuestionLevel getQuestionLevelByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<QuestionLevel> query = session.createQuery("FROM QuestionLevel WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			QuestionLevel QuestionLevel = query.uniqueResult();

			return QuestionLevel;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createQuestionLevel(QuestionLevel QuestionLevel) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(QuestionLevel);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateQuestionLevel(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get QuestionLevel
//			QuestionLevel QuestionLevel = (QuestionLevel) session.load(QuestionLevel.class, id);
//
//			// update
//			QuestionLevel.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateQuestionLevel(QuestionLevel QuestionLevel) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(QuestionLevel);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteQuestionLevel(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get QuestionLevel
			QuestionLevel QuestionLevel = (QuestionLevel) session.load(QuestionLevel.class, id);

			// delete
			session.delete(QuestionLevel);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isQuestionLevelExistsByID(short id) {

		// get QuestionLevel
		QuestionLevel QuestionLevel = getQuestionLevelByID(id);

		// return result
		if (QuestionLevel == null) {
			return false;
		}

		return true;
	}

	public boolean isQuestionLevelExistsByName(String name) {
		QuestionLevel QuestionLevel = getQuestionLevelByName(name);

		if (QuestionLevel == null) {
			return false;
		}
		return true;
	}

}
