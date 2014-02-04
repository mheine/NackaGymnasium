package heine;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Window_2 extends JFrame implements ActionListener {
	
	private JButton titleButton;
	private JTextArea textarea;
	
	public Window_2() {
		
		init();
		
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		
		titleButton = new JButton("Byt titel");
		titleButton.addActionListener(this);

		textarea = new JTextArea("", 2, 20);
		

		mainPanel.add(titleButton);
		mainPanel.add(textarea);
		
	}
	
	private void init() {
		setSize(500, 100);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster! Sjukt kul.");
	}
	
	
	
	public static void main(String [] args) {
		
		new Window_2();   
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == titleButton) {
			String title = textarea.getText();
			this.setTitle(title);

		}
		
	}

}
