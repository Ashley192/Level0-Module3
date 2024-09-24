
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
		while (true) {

			rob.penDown();
			// 2. Make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(100);
			rob.move(120);
			rob.turn(72);
			rob.move(120);
			rob.turn(72);
			rob.move(120);
			rob.turn(72);
			rob.move(120);
			rob.turn(72);
			rob.move(120);
			rob.turn(72);
			rob.move(120);
			// 3. Set the pen width to 10
			rob.setPenWidth(10);
			// 4. Ask the user what color pen they would like the robot to draw with
			String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equals ("green")) {
				rob.setPenColor(Color.green);
			}
			if (color.equals("blue")) {
				rob.setPenColor(Color.blue);
			}
			if (color.equals("red")) {
				rob.setPenColor(Color.red);
			}
			if (color.equals ("white")) {
				rob.setPenColor(Color.white);
			}
			if (color.equals ("yellow")) {
				rob.setPenColor(Color.yellow);
			}
			if (color.equals ("orange")) {
				rob.setPenColor(Color.orange);
			}
			if (color.equals ("gray")) {
				rob.setPenColor(Color.gray);
			}
			if (color.equals("pink")) {
				rob.setPenColor(Color.pink);
			}
			// 6. If the user doesn't enter anything, choose a random color
			if (color.equals("")) {
				rob.setRandomPenColor();
			}

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

		}

	}
}
