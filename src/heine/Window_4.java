package heine;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Window_4 extends JFrame implements ActionListener{

	private DrawingBoard drawingBoard = new DrawingBoard();
	
	public Window_4() {
		setTitle("Rita!");
		
		drawingBoard.setPreferredSize(new Dimension(300, 300));
		drawingBoard.setBackground(Color.white);
		
		
		add(drawingBoard, BorderLayout.CENTER);
		
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		drawingBoard.requestFocus();
	}
	
	
	////////////////////////////
	public static void main (String[] arg) {
		new Window_4();
	}
	////////////////////////////
}
class DrawingBoard extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(240, 210, 210));
		g.fillOval(100, 50, 100, 120);
		
		g.setColor(Color.RED);
		g.drawArc(125, 130, 50, 20, 180, 180);
		
		g.setColor(Color.CYAN);
		g.fillOval(125, 85, 15, 15);
		g.fillOval(160, 85, 15, 15);
	}
}