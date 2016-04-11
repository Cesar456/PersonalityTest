package com.cesar.per.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.cesar.per.bean.Subject;
import com.cesar.per.bean.User;
import com.cesar.per.bean.UserScore;
import com.cesar.per.util.JXLUtil;

public class SubjectService extends BaseService {

	private static final int SUBJECTLENGTH = 60;

	private DecimalFormat df = new DecimalFormat("0.00");

	public List<String> saveScore(String userName, String allScore)
			throws Exception {
		User user = new User();
		List<User> users = getUserDAO().findByUserName(userName);
		if (users.size() == 0 || users == null) {
			user.setUserName(userName);
			getUserDAO().save(user);
		} else {
			throw new Exception("The user is exists");
		}
		char[] scores = allScore.toCharArray();
		if (scores.length != SUBJECTLENGTH) {
			throw new Exception("The anwsers size is incurrent");
		}

		List<UserScore> userScores = new ArrayList<UserScore>();
		for (int i = 0; i < scores.length; i++) {
			int subjectId = i + 1;
			int score = Integer.parseInt(String.valueOf(scores[i]));
			if (JXLUtil.isAginst(subjectId) == 1) {
				score = 6 - score;
			}
			UserScore userScore = new UserScore();
			userScore.setSubjectId(subjectId);
			userScore.setUserId(user.getId());
			userScore.setScore(score);
			getUserScoreDAO().save(userScore);
			userScores.add(userScore);
		}
		return getResult(userScores);
	}

	/**
	 * 返回用户的性格测试结果
	 * 
	 * @param userScores
	 * @return
	 */
	public List<String> getResult(List<UserScore> userScores) {

		List<String> result = new ArrayList<String>();

		int neuroticismTotle = 0;
		int extraversionTotle = 0;
		int opennessTotle = 0;
		int agreeablenessFacetsTotle = 0;
		int conscientiousnessTotle = 0;

		for (UserScore userScore : userScores) {
			int i = JXLUtil.getDe(userScore.getSubjectId());
			switch (i) {
			case 1:
				neuroticismTotle += userScore.getScore();
				break;
			case 2:
				extraversionTotle += userScore.getScore();
				break;
			case 3:
				opennessTotle += userScore.getScore();
				break;
			case 4:
				agreeablenessFacetsTotle += userScore.getScore();
				break;
			case 5:
				conscientiousnessTotle += userScore.getScore();
				break;
			default:
				break;
			}
		}

		double neuroticismResult = (double) neuroticismTotle
				/ (double) JXLUtil.neuroticism.length;
		double extraversionResult = (double) extraversionTotle
				/ (double) JXLUtil.extraversion.length;
		double opennessResult = (double) opennessTotle
				/ (double) JXLUtil.openness.length;
		double agreeablenessFacetsResult = (double) agreeablenessFacetsTotle
				/ (double) JXLUtil.agreeablenessFacets.length;
		double conscientiousnessResult = (double) conscientiousnessTotle
				/ (double) JXLUtil.conscientiousness.length;

//		System.out.println(neuroticismResult);
//		System.out.println(extraversionResult);
//		System.out.println(opennessResult);
//		System.out.println(agreeablenessFacetsResult);
		System.out.println(conscientiousnessResult);

		result.add(df.format(neuroticismResult));
		result.add(df.format(extraversionResult));
		result.add(df.format(opennessResult));
		result.add(df.format(agreeablenessFacetsResult));
		result.add(df.format(conscientiousnessResult));

		return result;

	}

	/**
	 * 该方法返回该用户的中奖等级
	 * @param userName
	 * @return
	 * @throws Exception 
	 */
	public void lottery(String userName, double prize) throws Exception {
		User user = new User();
		List<User> users = getUserDAO().findByUserName(userName);
		if(prize>7||prize<0){
			prize = 0;
		}
		if (users != null&&users.size()>0) {
			user = users.get(0);
		} else {
			throw new Exception("The user is not exists");
		}
		user.setPrize(prize);
		getUserDAO().update(user);
	}

	public List<Subject> getSubjects() {
		List<Subject> subjects = getSubjectDAO().findAll();
		return subjects;
	}
}
