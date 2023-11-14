import java.util.*;

public class Course {
	
	String courseName;
	String courseSubject;
	String courseType;
	
	ArrayList<String> studentNames = new ArrayList<String>();
	ArrayList<String> studentIDs = new ArrayList<String>();
	
	//Array List Values are Sorted by testGrades(studentPosition[testNum])
	ArrayList<ArrayList<Integer>> testGrades = new ArrayList<ArrayList<Integer>>();
	
	// Helps sort the ArrayLists in sortGrade function.
	ArrayList<String> sortedNames = new ArrayList<String>();
	ArrayList<Integer> sortedScores = new ArrayList<Integer>();
	boolean isSorted = false;
	
	public Course(String name, String sub, String type) {
		
		courseName = name;
		courseSubject = sub;
		courseType = type;
		
	}
	
	public void addStudent(String name, String ID) {
		
		studentNames.add(name);
		studentIDs.add(ID);
		isSorted = false;
		
	}
	
	public void addGrade(String ID, int testNum, int testGrade) {
		
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		
		tempArr.add(testNum - 1, testGrade);
		
		
		testGrades.add(studentIDs.indexOf(ID), tempArr);
		isSorted = false;
		
	}
	
	public void updateGrade(String ID, int testNum, int testGrade) {
		
		testGrades.get(studentIDs.indexOf(ID)).set(testNum - 1, testGrade);
		isSorted = false;
	}
	
	public void printGrade(int testNum) {
		
		if(!isSorted) {
			
			for(int i = 0; i < testGrades.size(); i++) {
				
				System.out.print(studentNames.get(i) + " ");
				System.out.println(testGrades.get(i).get(testNum - 1));
				
			}
		}
		
		else if(isSorted) {
			for(int i = 0; i < testGrades.size(); i++) {
				
				System.out.print(sortedNames.get(i) + " ");
				System.out.println(sortedScores.get(i) + " ");
			}
		}
		
	}
	
	public void sortGrade(int testNum) {
		ArrayList<Integer> tempGradeArray = new ArrayList<Integer>();
		ArrayList<String> tempNameArray = new ArrayList<String>();
		
		
		
		for(int i = 0; i < testGrades.size(); i++) {
			
			tempGradeArray.add(testGrades.get(i).get(testNum - 1));
			
		}
		
		tempGradeArray.sort(Comparator.reverseOrder());
		
		for(int i = 0; i < tempGradeArray.size(); i++) {
			
			for(int j = 0; j < testGrades.size(); j++) {
				
				if(tempGradeArray.get(i) == testGrades.get(j).get(testNum - 1)) {
					
					tempNameArray.add(studentNames.get(j));
					
				}
				
			}
			
		}	

		
		sortedNames = tempNameArray;
		sortedScores = tempGradeArray;
		
		
		
		isSorted = true;
	}
	
	
	
}
