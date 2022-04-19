package Jeu;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class GameForm extends JFrame {

	/**
	 * Launch the application.
	 */
	
	//erreur in the fist columns sure out of bounds clearly
	JLabel scoreLevel = new JLabel("Score:"+0);
	JLabel scoreDisplay = new JLabel("Level :"+0);
	private GameArea gameArea;
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameForm frame = new GameForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
		
	}

	/**
	 * Create the frame.
	 */
	public GameForm() {
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 521);
		getContentPane().setLayout(null);
		

		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(149, 11, 200, 400);
		getContentPane().add(panel);
		
		
		gameArea = new GameArea(panel,10);
		getContentPane().add(gameArea);
		gameArea.setSize(200 , 400);
		gameArea.setLocation(175, 39);
		getContentPane().add(gameArea );
		
		
		
		scoreDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scoreDisplay.setBounds(402, 58, 87, 53);
		getContentPane().add(scoreDisplay);
		
		
		scoreLevel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scoreLevel.setBounds(402, 108, 90, 46);
		getContentPane().add(scoreLevel);
		
		JLabel Logo = new JLabel("Bienvenue sur Tetris Simon ");
		Logo.setBackground(Color.BLACK);
		Logo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Logo.setBounds(38, 11, 350, 26);
		getContentPane().add(Logo);
		initControls();
		startGame();
	}
	
	private void initControls() {
		
		InputMap im=this.getRootPane().getInputMap();
		ActionMap am=this.getRootPane().getActionMap();
		
		im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
		im.put(KeyStroke.getKeyStroke("LEFT"), "left");
		im.put(KeyStroke.getKeyStroke("UP"), "up");
		im.put(KeyStroke.getKeyStroke("DOWN"), "down");
		
	
		
		am.put("right",new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gameArea.moveBlockRight();
				
			}
			
		});
		
		am.put("left",new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gameArea.moveBlockLeft();
				
			}
			
		});
		
		am.put("up",new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gameArea.rotateBlock();
				
			}
			
		});
		
		am.put("down",new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gameArea.moveBlockDown();
				
			}
			
		});
	
		
	}
	public void startGame() {
		new GameThread(gameArea,this).start(); //gamethread GameThread class hinerit from Threat class
	
	}
	
	public void updateScore(int level) {
		scoreDisplay.setText("Level :"+ level);
	}
	public void updateLevel(int score ) {
		scoreLevel.setText("Score :"+score);
	}
}
