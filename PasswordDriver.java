//observation worshipping description nondescript eliminating survivalist destructive infestation surrounding persecution 
// interesting explanation recognition programming personality hospitality distinguish devastation nightvision engineering q

public class PasswordDriver {
	public static void main(String args[]) {
		Password myPass = new Password();
		addWords(myPass);
		guessWords(myPass);
	}

	public static void addWords(Password thePass) {
		String word = Keyboard.readString("Enter a string: ");
		while(!word.equals("q")) {
			thePass.addWord(word);
			word = Keyboard.readString("Enter a string: ");
		}


	}

	public static void guessWords(Password thePass) {
		
		//Catch special cases where 
		boolean done = thePass.getNumberOfPasswordsLeft() <= 1;

		if (done) {
			System.out.println(thePass);
		}

		while(!done) {
			int best_index = thePass.bestGuess();

			System.out.println("You should guess: " + thePass.getOriginalWord(best_index));
			
			int guess_index = Keyboard.readInt("Index of word to guess (1-based, from original list): ");
			int char_matches = Keyboard.readInt("Number of character matches: ");

			thePass.guess(guess_index, char_matches);

			System.out.println("\n\n" + thePass);	//.toString() is automatically called; prints all remaining possibilites

			done = thePass.getNumberOfPasswordsLeft() <= 1;

		}

			
	}
}