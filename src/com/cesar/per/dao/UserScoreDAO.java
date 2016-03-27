package com.cesar.per.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cesar.per.bean.UserScore;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserScore entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cesar.per.bean.UserScore
 * @author MyEclipse Persistence Tools
 */
public class UserScoreDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UserScoreDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String SUBJECT_ID = "subjectId";
	public static final String SCORE = "score";

	protected void initDao() {
		// do nothing
	}

	public void save(UserScore transientInstance) {
		log.debug("saving UserScore instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserScore persistentInstance) {
		log.debug("deleting UserScore instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserScore findById(java.lang.Integer id) {
		log.debug("getting UserScore instance with id: " + id);
		try {
			UserScore instance = (UserScore) getHibernateTemplate().get(
					"com.cesar.per.bean.UserScore", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserScore instance) {
		log.debug("finding UserScore instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserScore instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserScore as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findBySubjectId(Object subjectId) {
		return findByProperty(SUBJECT_ID, subjectId);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all UserScore instances");
		try {
			String queryString = "from UserScore";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserScore merge(UserScore detachedInstance) {
		log.debug("merging UserScore instance");
		try {
			UserScore result = (UserScore) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserScore instance) {
		log.debug("attaching dirty UserScore instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserScore instance) {
		log.debug("attaching clean UserScore instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserScoreDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserScoreDAO) ctx.getBean("UserScoreDAO");
	}
}