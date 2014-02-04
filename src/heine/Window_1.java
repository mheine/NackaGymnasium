package heine;

import javax.swing.*;

@SuppressWarnings("serial")
public class Window_1 extends JFrame {
	
	public Window_1() {
		
		setSize(500, 500);
		setVisible(true);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster! Sjukt kul.");
		
		
		
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		
		JButton clickButton = new JButton("Klicka här!");
		mainPanel.add(clickButton);
		
	}	
	
	public static void main(String [] args) {
		
		new Window_1();   
		
	}

}
