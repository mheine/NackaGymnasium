package heine;

/**
 * @(#)AMF101.java
 *
 *
 * @author Fredrik/Marcus/Andreas
...  * @version 1.00 2011/9/2
 */

//TODO - Fix this

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window_3 extends JFrame implements ActionListener{
	private Spelplan plan = new Spelplan();
	private JPanel buttonPanel = new JPanel();
	private JButton[] buttons = new JButton[4];
	private String[] s ={"Nytt spel","Paus","Fortsätt","Avsluta"};
	
	public Window_3() {
		setTitle("AMF 101");
		
		plan.setPreferredSize(new Dimension(350,250));
		plan.setBackground(Color.white);
		
		buttonPanel.setLayout(new FlowLayout());
		
		for (int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText(s[i]);
			buttons[i].addActionListener(this);
			buttonPanel.add(buttons[i]);
		}
		
		add(plan, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		plan.init();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		plan.requestFocus();
		
		if (e.getSource() == buttons[0])
			plan.nyttSpel();
		else if (e.getSource() == buttons[1])
			plan.stoppaSpel();
		else if (e.getSource() == buttons[2])
			plan.startaSpel();
		else if (e.getSource() == buttons[3])
			System.exit(0);
	}
	
	
	////////////////////////////
	public static void main (String[] arg) {
		new Window_3();
	}
	////////////////////////////
}
class Spelplan extends JPanel implements ActionListener {
	private Timer tim = new Timer(100, this);
	private int xMax, yMax;
	private int r;
	private int rVä, rHö, rL, rSteg;
	private int vänsterkant = 100, överkant = 100, bredd = 10, höjd = 10;
	public void init() {
		xMax = getSize().width-1;
		yMax = getSize().height-1;
		r = yMax/20;
		rL = 9;
		rSteg = r;
		addKeyListener(kl);
	}
	public void startaSpel() {
		tim.start();
	}
	public void stoppaSpel() {
		tim.stop();
	}
	public void nyttSpel() {
		stoppaSpel();
		startaSpel();
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(vänsterkant, överkant, bredd, höjd);
	}
	KeyListener kl = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_W) {
				överkant = Math.max(0, överkant-rSteg);
			}
			else if (e.getKeyCode() == KeyEvent.VK_S) {
				överkant = Math.min(yMax-rL, överkant+rSteg);
			}
			else if (e.getKeyCode() == KeyEvent.VK_A) {
				vänsterkant = Math.max(0, vänsterkant-rSteg);
			}
			else if (e.getKeyCode() == KeyEvent.VK_D) {
				vänsterkant = Math.min(xMax-rL, vänsterkant+rSteg);
			}
			else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
		}
	};
}