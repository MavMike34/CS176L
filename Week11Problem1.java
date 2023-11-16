import java.util.*;

//Converting Number to Roman Numerals (1-3999)
public class Week11Problem1 {

	public static String convertToRoman(int userInt) {
		
		String userS = Integer.toString(userInt);
		String rNum = "";
		
		if(userS.length() == 3) {
			userS = "0" + userS;
		}
		
		if(userS.length() == 2) {
			userS = "00" + userS;
		}
		
		if(userS.length() == 1) {
			userS = "000" + userS;
		}
		
		switch(userS.charAt(0)){
			case '1':
				rNum += "M";
				break;
			case '2':
				rNum += "MM";
				break;
			case '3':
				rNum += "MMM";
				break;
			default:
				break;
		}
			
		switch(userS.charAt(1)){
			case '1':
				rNum += "C";
				break;
			case '2':
				rNum += "CC";
				break;
			case '3':
				rNum += "CCC";
				break;
			case '4':
				rNum += "CD";
				break;
			case '5':
				rNum += "D";
				break;
			case '6':
				rNum += "DC";
				break;
			case '7':
				rNum += "DCC";
				break;
			case '8':
				rNum += "DCCC";
				break;
			case '9':
				rNum += "CM";
				break;
			default:
				break;
				
		}
			
		switch(userS.charAt(2)){
			case '1':
				rNum += "X";
				break;
			case '2':
				rNum += "XX";
				break;
			case '3':
				rNum += "XXX";
				break;
			case '4':
				rNum += "XL";
				break;
			case '5':
				rNum += "L";
				break;
			case '6':
				rNum += "LX";
				break;
			case '7':
				rNum += "LXX";
				break;
			case '8':
				rNum += "LXXX";
				break;
			case '9':
				rNum += "XC";
				break;
			default:
				break;
			
		}
			
		switch(userS.charAt(3)){
			case '1':
				rNum += "I";
				break;
			case '2':
				rNum += "II";
				break;
			case '3':
				rNum += "III";
				break;
			case '4':
				rNum += "IV";
				break;
			case '5':
				rNum += "V";
				break;
			case '6':
				rNum += "VI";
				break;
			case '7':
				rNum += "VII";
				break;
			case '8':
				rNum += "VIII";
				break;
			case '9':
				rNum += "IX";
				break;
			
		}
		
		return rNum;
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number (1-3999)");
		int userNum = scnr.nextInt();
		
		while (userNum < 1 || userNum > 3999) {
			System.out.println("Error: Please enter a number between 1 and 3999.");
			userNum = scnr.nextInt();
		}
		
		System.out.println(userNum + " converted to Roman Numerals is "  + convertToRoman(userNum));

	}

}
