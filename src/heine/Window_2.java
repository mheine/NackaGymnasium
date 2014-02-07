package heine;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Window_2 extends JFrame implements ActionListener, KeyListener {
	
	private JButton blueButton;
	private JButton redButton;
	private JButton greenButton;
	
	private JLabel text;
	private JLabel tangent;
	
	private JPanel mainPanel;
	
	public Window_2() {
		
		init();
		
		mainPanel = new JPanel();
		this.add(mainPanel);
		
		
		
		blueButton = new JButton("Byt till Blå");
		blueButton.addActionListener(this);
		blueButton.addKeyListener(this);

		greenButton = new JButton("Byt till Grön");
		greenButton.addActionListener(this);
		greenButton.addKeyListener(this);

		redButton = new JButton("Byt till Röd");
		redButton.addActionListener(this);
		redButton.addKeyListener(this);
		
		text = new JLabel("Färgen är svart");
		tangent = new JLabel("Nuvarande bokstav: ");
		
		mainPanel.addKeyListener(this);
		
		mainPanel.add(blueButton);
		mainPanel.add(greenButton);
		mainPanel.add(redButton);
		mainPanel.add(text);
		mainPanel.add(tangent);
		
	}
	
	private void init() {
		setSize(400, 90);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setTitle("Ett fönster! Sjukt kul.");
	}
	
	
	
	public static void main(String [] args) {
		
		new Window_2();  
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == redButton) {
			text.setForeground(new Color(255, 0, 0));
			text.setText("Färgen är röd");
		}
		
		if(e.getSource() == blueButton) {
			text.setForeground(new Color(0, 0, 255));
			text.setText("Färgen är blå");
		}
		
		if(e.getSource() == greenButton) {
			text.setForeground(new Color(0, 255, 0));
			text.setText("Färgen är grön");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent ke) 	{ }

	@Override
	public void keyReleased(KeyEvent ke) 	{ }

	@Override
	public void keyTyped(KeyEvent ke) {
		tangent.setText("Nuvarande tangent: " + ke.getKeyChar());
		
	}

}
