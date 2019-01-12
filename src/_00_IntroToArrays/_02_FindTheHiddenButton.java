package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
	String num = JOptionPane.showInputDialog("Enter a positive integer:");
	int posNum = 0;
	boolean tryAgain = true;
	while(tryAgain) {
	if(num.matches("[0-9]+"))	{
		tryAgain = false;
		posNum = Integer.parseInt(num);
		if(posNum > 672 || posNum <= 1) {
			tryAgain = true;
			
		}
	JOptionPane.showMessageDialog(null, "Success!");

	}else {
		num = JOptionPane.showInputDialog("Error! Please enter a positive integer with only the digits 0-9 UNDER the value of 672 and more than 1, No letters, symbols, or commas:");
		
	}
	}
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons = new JButton[posNum];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for( int i = 0; i < buttons.length ; i ++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
		panel.add(buttons[i]);
			
		}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		if(posNum > 5) {
			hiddenButton = posNum - 4;
			
			
		}else {
			hiddenButton = posNum - 1;
			
		}
		//14. Set the text of the JButton located at hiddenButton to read "ME"
buttons[hiddenButton].setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
if(buttons[hiddenButton] == e.getSource()) {
	JOptionPane.showMessageDialog(null, "Correct");
	
}else {
	JOptionPane.showMessageDialog(null, "Wrong one! Try Again!");
	
}
		//18. else tell them to try again
	}
}
