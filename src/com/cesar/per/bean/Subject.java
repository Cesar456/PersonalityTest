package com.cesar.per.bean;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */

public class Subject implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer subjectId;
	private String subject;
	private Integer dimensionality;
	private Integer isAgainst;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** full constructor */
	public Subject(Integer subjectId, String subject, Integer dimensionality,
			Integer isAgainst) {
		this.subjectId = subjectId;
		this.subject = subject;
		this.dimensionality = dimensionality;
		this.isAgainst = isAgainst;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getDimensionality() {
		return this.dimensionality;
	}

	public void setDimensionality(Integer dimensionality) {
		this.dimensionality = dimensionality;
	}

	public Integer getIsAgainst() {
		return this.isAgainst;
	}

	public void setIsAgainst(Integer isAgainst) {
		this.isAgainst = isAgainst;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subjectId=" + subjectId + ", subject="
				+ subject + ", dimensionality=" + dimensionality
				+ ", isAgainst=" + isAgainst + "]";
	}

}