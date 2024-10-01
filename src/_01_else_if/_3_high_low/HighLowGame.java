
package _01_else_if._3_high_low;

import java.util.Random;
import javax.swing.JOptionPane;


public class HighLowGame {

	public static void main(String[] args) {
		int count=0;
		Random ran = new Random();
		int ranNum=ran.nextInt(100)+1;
		while(count<10){
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String guess=JOptionPane.showInputDialog("Enter a guess.");
		// 2. Print out the random variable above
		System.out.println(guess);
		// 3. Change this line to give you a random number between 1 - 100. 
		
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))		
		int number=Integer.parseInt(guess);
		// 5. if the guess is correct
	if (number==(ranNum)){
			JOptionPane.showMessageDialog(null,"You win!"); 	
			System.exit(0);
		}
		// 6. Win
		// 7. if the guess is high				
		if (number>ranNum) {
			JOptionPane.showMessageDialog(null,"Your guess is too high");
		}
		// 8. Tell them it's too high
		// 9. if the guess is low
		if (number<ranNum) {
			JOptionPane.showMessageDialog(null,"Your guess is too low");
		}
			count++;
		
	}
		// 10. Tell them it's too low
		// 11. Repeat steps 1 to 10 ten times
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
	
		// 13. Tell them they lose

				

		
	}

}


