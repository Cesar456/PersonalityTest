package com.cesar.per.service;

import java.util.List;

import com.cesar.per.bean.Subject;
import com.cesar.per.bean.User;
import com.cesar.per.bean.UserScore;
import com.cesar.per.util.JXLUtil;

public class SubjectService extends BaseService {

	public boolean saveScore(String userName, String allScore) throws Exception {
		User user = new User();
		List<User> users = getUserDAO().findByUserName(userName);
		if (users.size() == 0 || users == null) {
			user.setUserName(userName);
			getUserDAO().save(user);
		} else {
			throw new Exception("The user is exists");
		}
		char[] scores = allScore.toCharArray();
		if (scores.length != 60) {
			throw new Exception("The anwsers size is incurrent");
		}
		for (int i = 0; i < scores.length; i++) {
			
			int subjectId = i+1;
			int score = Integer.parseInt(String.valueOf(scores[i]));
			if (JXLUtil.isAginst(subjectId) == 1) {
				score = 6 - score;
			}
			UserScore userScore = new UserScore();
			userScore.setSubjectId(subjectId);
			userScore.setUserId(user.getId());
			userScore.setScore(score);
			getUserScoreDAO().save(userScore);
		}
		return true;
	}
	
	public List<Subject> getSubjects(){
		List<Subject> subjects = getSubjectDAO().findAll();
		return subjects;
	}
}
