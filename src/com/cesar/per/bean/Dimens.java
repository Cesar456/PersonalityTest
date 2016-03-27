package com.cesar.per.bean;

/**
 * Dimens entity. @author MyEclipse Persistence Tools
 */

public class Dimens implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String dimenSubject;
	private String dimenSubjectEnglish;
	private String discribe;

	// Constructors

	/** default constructor */
	public Dimens() {
	}

	/** minimal constructor */
	public Dimens(Integer id, String dimenSubject) {
		this.id = id;
		this.dimenSubject = dimenSubject;
	}

	/** full constructor */
	public Dimens(Integer id, String dimenSubject, String dimenSubjectEnglish,
			String discribe) {
		this.id = id;
		this.dimenSubject = dimenSubject;
		this.dimenSubjectEnglish = dimenSubjectEnglish;
		this.discribe = discribe;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDimenSubject() {
		return this.dimenSubject;
	}

	public void setDimenSubject(String dimenSubject) {
		this.dimenSubject = dimenSubject;
	}

	public String getDimenSubjectEnglish() {
		return this.dimenSubjectEnglish;
	}

	public void setDimenSubjectEnglish(String dimenSubjectEnglish) {
		this.dimenSubjectEnglish = dimenSubjectEnglish;
	}

	public String getDiscribe() {
		return this.discribe;
	}

	public void setDiscribe(String discribe) {
		this.discribe = discribe;
	}

}