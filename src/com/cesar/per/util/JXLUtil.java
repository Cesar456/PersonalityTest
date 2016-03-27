package com.cesar.per.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.cesar.per.bean.Subject;

public class JXLUtil {
	
	
	private static final String excelPath = "C:\\Users\\Cesar\\Desktop\\per.xls";
	
	private static final int[] neuroticism = {1,6,11,16,21,26,31,36,41,46,51,56};
	private static final int[] extraversion = {2,7,12,17,22,27,32,37,42,47,52,57};
	private static final int[] openness = {3,8,13,18,23,28,33,38,43,48,53,58};
	private static final int[] agreeablenessFacets = {4,9,14,19,24,29,34,39,44,49,54,59};
	private static final int[] conscientiousness = {5,10,15,20,25,30,35,40,45,50,55,60};

	private static final int[] aginstS = {1,9,12,14,15,16,18,19,23,24,27,28,30,31,33,39,42,44,45,46,48,54,55,57,59};
	
	private static int getDe(int no){
		
		for(int i:neuroticism){
			if(i==no){
				return 1;
			}
		}

		for(int i:extraversion){
			if(i==no){
				return 2;
			}
		}

		for(int i:openness){
			if(i==no){
				return 3;
			}
		}

		for(int i:agreeablenessFacets){
			if(i==no){
				return 4;
			}
		}

		for(int i:conscientiousness){
			if(i==no){
				return 5;
			}
		}
		return -1;
	}
	
	public static int isAginst(int no) {
		for(int i : aginstS){
			if(no==i){
				return 1;
			}
		}
		return 0;
	}
	
	
	public static List<Subject> getAllSubject() throws Exception{
		Workbook workbook = null ;
		List<Subject> subjects = new ArrayList<Subject>();
		try {
			workbook = Workbook.getWorkbook(new File(excelPath));
			Sheet sheet = workbook.getSheet(0);
			for(int i = 0;i<sheet.getRows();i++){
				Cell cell = sheet.getCell(0, i);
				String content = cell.getContents();
				
				int spit = content.indexOf(".");
				int num = Integer.parseInt(content.substring(0, spit));
				String subject = content.substring(spit+1,content.length());

				Subject sub = new Subject();
				sub.setSubject(subject);
				int de = getDe(num);
				if(de==-1){
					throw new Exception("没有该序号");
				}
				sub.setDimensionality(de);
				sub.setIsAgainst(isAginst(num));
				sub.setSubjectId(num);
				subjects.add(sub);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			workbook.close();
		}
		return subjects;
	}
	

}
