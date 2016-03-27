package com.cesar.per.bean;

/**
 * UserScore entity. @author MyEclipse Persistence Tools
 */

public class UserScore implements java.io.Serializable {

	// Fields
	private Integer id;
	private Integer userId;
	private Integer subjectId;
	private Integer score;

	// Constructors

	/** default constructor */
	public UserScore() {
	}

	/** full constructor */
	public UserScore(Integer userId, Integer subjectId, Integer score) {
		this.userId = userId;
		this.subjectId = subjectId;
		this.score = score;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}