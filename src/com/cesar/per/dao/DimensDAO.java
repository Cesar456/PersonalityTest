package com.cesar.per.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cesar.per.bean.Dimens;

/**
 * A data access object (DAO) providing persistence and search support for
 * Dimens entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cesar.per.bean.Dimens
 * @author MyEclipse Persistence Tools
 */
public class DimensDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DimensDAO.class);
	// property constants
	public static final String DIMEN_SUBJECT = "dimenSubject";
	public static final String DIMEN_SUBJECT_ENGLISH = "dimenSubjectEnglish";
	public static final String DISCRIBE = "discribe";

	protected void initDao() {
		// do nothing
	}

	public void save(Dimens transientInstance) {
		log.debug("saving Dimens instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dimens persistentInstance) {
		log.debug("deleting Dimens instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dimens findById(java.lang.Integer id) {
		log.debug("getting Dimens instance with id: " + id);
		try {
			Dimens instance = (Dimens) getHibernateTemplate().get(
					"com.cesar.per.bean.Dimens", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dimens instance) {
		log.debug("finding Dimens instance by example");
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
		log.debug("finding Dimens instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dimens as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDimenSubject(Object dimenSubject) {
		return findByProperty(DIMEN_SUBJECT, dimenSubject);
	}

	public List findByDimenSubjectEnglish(Object dimenSubjectEnglish) {
		return findByProperty(DIMEN_SUBJECT_ENGLISH, dimenSubjectEnglish);
	}

	public List findByDiscribe(Object discribe) {
		return findByProperty(DISCRIBE, discribe);
	}

	public List findAll() {
		log.debug("finding all Dimens instances");
		try {
			String queryString = "from Dimens";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dimens merge(Dimens detachedInstance) {
		log.debug("merging Dimens instance");
		try {
			Dimens result = (Dimens) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dimens instance) {
		log.debug("attaching dirty Dimens instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dimens instance) {
		log.debug("attaching clean Dimens instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimensDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DimensDAO) ctx.getBean("DimensDAO");
	}
}