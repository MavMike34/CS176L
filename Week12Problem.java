import java.util.*;

public class Week12Problem {

	
	//Function prints out current status of game.
	public static void GetUpdate(int wG, ArrayList<Character> lG, ArrayList<Character> bW, String h) {
		System.out.println("Current Wrong Guesses: " + wG);
		
		switch(wG) {
			case 1:
				System.out.println("The hangman has his head drawn.");
				break;
			case 2:
				System.out.println("The hangman has his head and neck drawn.");
				break;
			case 3:
				System.out.println("The hangman has his head, neck, and body drawn.");
				break;
			case 4:
				System.out.println("The hangman has his head, neck, body, and right arm drawn.");
				break;
			case 5:
				System.out.println("The hangman has his head, neck, body, right and left arms drawn.");
				break;
			case 6:
				System.out.println("The hangman has his head, neck, body, right and left arms, and right leg drawn.");
				break;
			case 7:
				System.out.println("The hangman is fully drawn.");
				break;
		}
		
		System.out.print("Letters Guessed: ");
		
		for(int i = 0; i < lG.size(); i++) {
			System.out.print(lG.get(i) + " ");
		}
		
		
		
		System.out.print("\nWord: ");
		for(int i = 0; i < bW.size(); i++) {
			System.out.print(bW.get(i) + " ");
		}
		
		System.out.println("\nHint: " + h);
		
		
		
	}
	
	//This program plays HANGMAN.
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); 
		ArrayList<Character> lettersGuessed = new ArrayList<Character>();
		int wrongGuesses = 0;
		ArrayList<Character> finalWord = new ArrayList<Character>();
		ArrayList<Character> blankWord = new ArrayList<Character>();
		
		System.out.println("Choose a word to guess: ");
		String guessWord = scnr.next();
		guessWord = guessWord.toUpperCase();
		
		System.out.println("Choose a hint for word: ");
		String hint = scnr.next();
		
		for (int i = 0; i < guessWord.length(); i++) {
			finalWord.add(i, guessWord.charAt(i));
		}
		
		for (int i = 0; i < guessWord.length(); i++) {
			blankWord.add(i, '_');
		}
		
		
		
		//START OF GAME!
		for (int i = 0; i < 26; i++) {
			
			//Checks if user guesses the word.
			if(blankWord.equals(finalWord)) {
				break;
			}
			
			//Checks if user does not have 7 wrong guesses.
			if(wrongGuesses < 7) {
				GetUpdate(wrongGuesses, lettersGuessed, blankWord, hint);
				System.out.println("\nGUESS A LETTER: ");
				String currentGuess = scnr.next();
				currentGuess = currentGuess.toUpperCase();
				char charGuess = currentGuess.charAt(0);
				lettersGuessed.add(charGuess);
				
				if(!guessWord.contains(currentGuess)) {
					wrongGuesses += 1;
				}
				
				for(int j = 0; j < finalWord.size(); j++) {
					if(charGuess == finalWord.get(j)) {
						blankWord.set(j, charGuess);
					}
				}
			}			
			
			
			else {
				break;
			}
			
			
		}
		
		//User Loses.
		if(wrongGuesses == 7) {
			System.out.println("The hangman is fully drawn.");
			System.out.println("Game Over. The correct word was: " + guessWord);
		}
		
		//User Wins.
		else {
			System.out.println("YOU WIN! You have guessed the word: " + guessWord);
		}
	}
}
