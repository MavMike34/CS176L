import java.util.*;

public class Week14Problem3 {

	static boolean b1firstC = true;
	static boolean b1secondC = true;
	static boolean b1thirdC = true;
	
	//Row 1-9 Without Repetition.
	public static void FirstCheck(String[] s) {
		
		ArrayList<Integer> checkDup = new ArrayList<Integer>();
		
		for(int i = 0; i < 9; i++) {
			
			if(Character.isDigit(s[i].charAt(0))){
				int num = Integer.parseInt(s[i]);
				
				if(checkDup.contains(num)) {
					b1firstC = false;
				}
				
				else {
					checkDup.add(num);
				}
			}
			
		}
		
	}
	
	//Column 1-9 Without Repetition
	public static void SecondCheck(String[] s1,String[] s2,String[] s3,String[] s4,String[] s5,String[] s6,String[] s7,String[] s8,String[] s9) {
		
		for(int i = 0; i < 9; i++) {
			String[] currentC = new String[9];
			currentC[0] = s1[i];
			currentC[1] = s2[i];
			currentC[2] = s3[i];
			currentC[3] = s4[i];
			currentC[4] = s5[i];
			currentC[5] = s6[i];
			currentC[6] = s7[i];
			currentC[7] = s8[i];
			currentC[8] = s9[i];
			
			ArrayList<Integer> checkDup = new ArrayList<Integer>();
			
			for(int j = 0; j<9; j++) {
				
				if(Character.isDigit(currentC[j].charAt(0))){
					int num = Integer.parseInt(currentC[j]);
					
					if(checkDup.contains(num)) {
						b1secondC = false;
					}
					
					else {
						checkDup.add(num);
					}
				}
			}
		}
	}
	
	//Each 3x3 Cube 1-9 Without Repetition
	public static void ThirdCheck(String[] s1,String[] s2,String[] s3,String[] s4,String[] s5,String[] s6,String[] s7,String[] s8,String[] s9) {
			
		String[] currentB1 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB2 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB3 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB4 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB5 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB6 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB7 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB8 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		String[] currentB9 = new String[] {s1[0], s1[1], s1[2], s2[0], s2[1], s2[2], s3[0], s3[1], s3[2]};
		
		ArrayList<Integer> checkDup = new ArrayList<Integer>();	
			
		for(int j = 0; j<9; j++) {
				
			if(Character.isDigit(currentB1[j].charAt(0))){
				int num = Integer.parseInt(currentB1[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB2[j].charAt(0))){
				int num = Integer.parseInt(currentB2[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB3[j].charAt(0))){
				int num = Integer.parseInt(currentB3[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB4[j].charAt(0))){
				int num = Integer.parseInt(currentB4[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB5[j].charAt(0))){
				int num = Integer.parseInt(currentB5[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB6[j].charAt(0))){
				int num = Integer.parseInt(currentB6[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB7[j].charAt(0))){
				int num = Integer.parseInt(currentB7[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB8[j].charAt(0))){
				int num = Integer.parseInt(currentB8[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
		
		for(int j = 0; j<9; j++) {
			
			if(Character.isDigit(currentB9[j].charAt(0))){
				int num = Integer.parseInt(currentB9[j]);
					
				if(checkDup.contains(num)) {
					b1thirdC = false;
				}
					
				else {
					checkDup.add(num);
				}
				
				if(j == 8) {
					checkDup.clear();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		//First Sudoku Board
		String[] b1Row1 = new String[] {"5","3",".",".","7",".",".",".","."};
		String[] b1Row2 = new String[] {"6",".",".","1","9","5",".",".","."};
		String[] b1Row3 = new String[] {".","9","8",".",".",".",".","6","."};
		String[] b1Row4 = new String[] {"8",".",".",".","6",".",".",".","3"};
		String[] b1Row5 = new String[] {"4",".",".","8",".","3",".",".","1"};
		String[] b1Row6 = new String[] {"7",".",".",".","2",".",".",".","6"};
		String[] b1Row7 = new String[] {".","6",".",".",".",".","2","8","."};
		String[] b1Row8 = new String[] {".",".",".","4","1","9",".",".","5"};
		String[] b1Row9 = new String[] {".",".",".",".","8",".",".","7","9"};
		
		FirstCheck(b1Row1);
		FirstCheck(b1Row2);
		FirstCheck(b1Row3);
		FirstCheck(b1Row4);
		FirstCheck(b1Row5);
		FirstCheck(b1Row6);
		FirstCheck(b1Row7);
		FirstCheck(b1Row8);
		FirstCheck(b1Row9);
		
		if(b1firstC) {
			
			SecondCheck(b1Row1, b1Row2, b1Row3, b1Row4, b1Row5, b1Row6, b1Row7, b1Row8, b1Row9);
			
			if(b1secondC) {
				
				ThirdCheck(b1Row1, b1Row2, b1Row3, b1Row4, b1Row5, b1Row6, b1Row7, b1Row8, b1Row9);
				
				if(b1thirdC) {
					System.out.println("Board 1 is true!");
				}
				
				else {
					System.out.println("Board 1 is false!");
				}
			}
			
			else {
				System.out.println("Board 1 is false!");
			}
		}
		
		else {
			System.out.println("Board 1 is false!");
		}
		
		
		
		//Second Sudoku Board
		String[] b2Row1 = new String[] {"8","3",".",".","7",".",".",".","."};
		String[] b2Row2 = new String[] {"6",".",".","1","9","5",".",".","."};
		String[] b2Row3 = new String[] {".","9","8",".",".",".",".","6","."};
		String[] b2Row4 = new String[] {"8",".",".",".","6",".",".",".","3"};
		String[] b2Row5 = new String[] {"4",".",".","8",".","3",".",".","1"};
		String[] b2Row6 = new String[] {"7",".",".",".","2",".",".",".","6"};
		String[] b2Row7 = new String[] {".","6",".",".",".",".","2","8","."};
		String[] b2Row8 = new String[] {".",".",".","4","1","9",".",".","5"};
		String[] b2Row9 = new String[] {".",".",".",".","8",".",".","7","9"};
				
		FirstCheck(b2Row1);
		FirstCheck(b2Row2);
		FirstCheck(b2Row3);
		FirstCheck(b2Row4);
		FirstCheck(b2Row5);
		FirstCheck(b2Row6);
		FirstCheck(b2Row7);
		FirstCheck(b2Row8);
		FirstCheck(b2Row9);
				
		if(b1firstC) {
			
			SecondCheck(b2Row1, b2Row2, b2Row3, b2Row4, b2Row5, b2Row6, b2Row7, b2Row8, b2Row9);
			
			if(b1secondC) {
				
				ThirdCheck(b2Row1, b2Row2, b2Row3, b2Row4, b2Row5, b2Row6, b2Row7, b2Row8, b2Row9);
				
				if(b1thirdC) {
					System.out.println("Board 2 is true!");
				}
						
				else {
					System.out.println("Board 2 is false!");
				}
			}
					
			else {
				System.out.println("Board 2 is false!");
			}
		}
				
		else {
			System.out.println("Board 2 is false!");
		}
	}

}
