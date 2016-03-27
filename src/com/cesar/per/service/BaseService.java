package com.cesar.per.service;

import com.cesar.per.dao.DimensDAO;
import com.cesar.per.dao.SubjectDAO;
import com.cesar.per.dao.UserDAO;
import com.cesar.per.dao.UserScoreDAO;

public class BaseService {
	
	private SubjectDAO subjectDAO;
	private DimensDAO dimensDAO;
	private UserDAO userDAO;
	private UserScoreDAO userScoreDAO;
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserScoreDAO getUserScoreDAO() {
		return userScoreDAO;
	}
	public void setUserScoreDAO(UserScoreDAO userScoreDAO) {
		this.userScoreDAO = userScoreDAO;
	}
	public DimensDAO getDimensDAO() {
		return dimensDAO;
	}
	public void setDimensDAO(DimensDAO dimensDAO) {
		this.dimensDAO = dimensDAO;
	}
	public SubjectDAO getSubjectDAO() {
		return subjectDAO;
	}
	public void setSubjectDAO(SubjectDAO subjectDAO) {
		this.subjectDAO = subjectDAO;
	}
}
