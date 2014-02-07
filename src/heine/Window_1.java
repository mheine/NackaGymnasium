package heine;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Window_1 extends JFrame implements ActionListener{
	
	private JPanel mainPanel;
	
	private JLabel countLabel;
	
	private JButton clickButton;
	private int counter = 0;
	
	
	public Window_1() {
		
		setSize(200, 90);
		setVisible(true);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster! Sjukt kul.");
		
		mainPanel = new JPanel();
		
		countLabel = new JLabel("Du har klickat " + counter + "gånger.");
		
		clickButton = new JButton("Klicka här!");
		clickButton.addActionListener(this);
		
		
		this.add(mainPanel);
		mainPanel.add(clickButton);
		mainPanel.add(countLabel);

		
	}	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clickButton)
		{
			counter++;
			countLabel.setText("Du har klickat " + counter + " gånger.");
		}
		
		
	}
	
	public static void main(String [] args) {
		
		new Window_1();   
		
	}



}
