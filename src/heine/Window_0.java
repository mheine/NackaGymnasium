package heine;

import javax.swing.*;

@SuppressWarnings("serial")
public class Window_0 extends JFrame {
	
	private JPanel mainPanel;	
	private JButton clickButton;
	
	
	public Window_0() {
		
		setSize(300, 300);
		setVisible(true);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster!");
		
		mainPanel = new JPanel();
		
		clickButton = new JButton("Klicka här!");
		
		
		this.add(mainPanel);
		mainPanel.add(clickButton);

		
	}
	
	public static void main(String [] args) {
		
		new Window_0();   
		
	}



}
