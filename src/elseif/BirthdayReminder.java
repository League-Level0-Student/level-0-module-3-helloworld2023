
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 20th";
		String dadsBirthday = "May 25th";
		String myBirthday = "July 22nd";
	
		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Whose birthday would you like?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday.equalsIgnoreCase("Ava")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	} 
}
