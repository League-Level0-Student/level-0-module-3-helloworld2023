package elseif;

import javax.swing.JOptionPane;

public class Happy {

	public static void main(String[] args) {
		
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else if (happy.toLowerCase().equals("no")) {
			String want = JOptionPane.showInputDialog("Do you want to be happy?");
			if (want.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else if (want.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			} 
		} 
	}
}
