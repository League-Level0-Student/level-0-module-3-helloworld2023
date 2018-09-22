//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot color = new Robot();
		color.setSpeed(30);
for (int i = 0; i < 7; i++) {
		//3. Ask the user what color they would like the robot to draw
		String draw = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (draw.toLowerCase().equals("red")) {
			color.setPenColor(255,0,0);
		}
		else if (draw.toLowerCase().equals("orange")) {
			color.setPenColor(255,153,51);
		}
		else if (draw.toLowerCase().equals("yellow")) {
			color.setPenColor(255,255,51);
		}
		else if (draw.toLowerCase().equals("green")) {
			color.setPenColor(0,255,0);
		}
		else if (draw.toLowerCase().equals("blue")) {
			color.setPenColor(0,0,255);
		}
		else if (draw.toLowerCase().equals("purple")) {
			color.setPenColor(153,51,255);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
			color.setRandomPenColor();		
		}
			
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

		//4. Set the pen width to 10
		color.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		color.penDown();
		for (int p = 0; p < 4; p++) {
		color.move(100);
		color.turn(90);
		}
}
}
}
