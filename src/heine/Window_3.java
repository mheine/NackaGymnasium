package heine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window_3 extends JFrame implements ActionListener {

	private Spelplan plan 		= new Spelplan();

	private JPanel buttonPanel 	= new JPanel();

	private JButton[] buttons 	= new JButton[4];

	private String[] s ={"Nytt spel","Paus","Fortsätt","Avsluta"};
	
	public Window_3() {
		setTitle("Flytta runt en fyrkant!");
		
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
	private int r, rVä, rHö, rL, rSteg;
	private int vänsterkant = 100, överkant = 100, bredd = 10, höjd = 10;
	
	public void init() {

		//Inte röra sig utanför gränserna
		xMax = getSize().width-1;
		yMax = getSize().height-1;

		//Definiera storleken på vår fyrkant
		r = yMax/20;
		rL = 9;
		rSteg = r;

		//Se till att vi kan använda tangentbordet
		addKeyListener(kl);
	}

	//Funktioner för att starta och avsluta spel.
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
		//Kallar i sin tur på paintComponent, vi uppdaterar vår bild.
		repaint(); 
	}


	public void paintComponent(Graphics g) {
		//Super? Yes, vi vill rita på Panelen.
		super.paintComponent(g);

		g.setColor(Color.green);
		g.fillRect(vänsterkant, överkant, bredd, höjd);
	}


	KeyListener kl = new KeyAdapter() {


		public void keyPressed(KeyEvent e) {
			//W = Upp.
			//Vi använder max() eftersom vi inte får gå ovanför banan.
			if (e.getKeyCode() == KeyEvent.VK_W) {
				överkant = Math.max(0, överkant-rSteg);
			}

			//S = Ner.
			//Vi vill inte hamna nedanför banan, därav min().
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