package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
Robot r = new Robot();
	public static void main(String[] args) {
		ObedientRobot o = new ObedientRobot();
		o.setup();
	}
	void setup() {
		
		r.setSpeed(20);
		r.penDown();
		String color = JOptionPane.showInputDialog("What color would you like? (red, orange, yellow, green, blue, or purple)");
		if (color.equalsIgnoreCase("red")) {
			r.setPenColor(255, 0, 0);
		}
		if (color.equalsIgnoreCase("orange")) {
			r.setPenColor(255, 128, 0);
		}
		if(color.equalsIgnoreCase("yellow")) {
			r.setPenColor(255, 255, 0);
		}
		if(color.equalsIgnoreCase("green")) {
			r.setPenColor(0, 255, 0);
		}
		if(color.equalsIgnoreCase("blue")) {
			r.setPenColor(0, 0, 255);
		}
		if(color.equalsIgnoreCase("purple")) {
			r.setPenColor(128, 0, 255);
		}
		String shape = JOptionPane.showInputDialog("Which shape do you want? (square, triangle, or circle");
		if (shape.equalsIgnoreCase("square")) {
			drawSquare();		}
		if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}
	
	void drawSquare(){
			for (int i = 1; i < 5; i++) {
			r.move(100);
			r.turn(90);
			}
	}
	void drawTriangle(){
		for (int i = 1; i < 4; i++) {
			r.move(100);
			r.turn(120);
			}
	}
	void drawCircle() {
		for (int i = 1; i < 361; i++) {
			r.move(1);
			r.turn(1);
		}
	}
	
	}
	

