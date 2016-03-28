package com.cesar.per.service.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cesar.per.bean.UserScore;
import com.cesar.per.service.SubjectService;

import junit.framework.TestCase;

public class SubjectServiceTest extends TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	public void testCal(){
		SubjectService service = context.getBean(SubjectService.class);
		
		List<UserScore> userScores = new ArrayList<UserScore>();
		
		for(int i = 0;i<60;i++){
			UserScore userScore = new UserScore();
			userScore.setScore(3);
			userScore.setSubjectId(i+1);
			userScores.add(userScore);
		}
		
		List<String> doubles = service.getResult(userScores);
		for(String double1:doubles){
			System.out.println(double1);
		}
	}

}
