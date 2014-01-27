package heine;

import javax.swing.*;

public class Window_2 extends JFrame {
	
	public Window_2() {
		
		init();
		
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		
		JButton clickButton = new JButton("Klicka här!");
		mainPanel.add(clickButton);
		
	}
	
	private void init() {
		setSize(500, 500);
		setVisible(true);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster! Sjukt kul.");
	}
	
	
	
	public static void main(String [] args) {
		
		new Window_2();   
		
	}

}
