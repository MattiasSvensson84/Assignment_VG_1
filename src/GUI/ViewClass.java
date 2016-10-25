package GUI;


import javax.swing.JFrame;

import PlayerMethods.PlayerMethods;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 * 
 * @author Mattias Svensson
 * 
 * Class for user interface. includes design on all the buttons and actions on them
 */
public class ViewClass implements ActionListener{

	private JFrame mainFrame;
	private PlayerMethods playerMethods = new PlayerMethods();
	private JLabel lblShowMusicName = new JLabel("");
	private JLabel lblMusic = new JLabel("Music: ");
	private JButton btnPlay = new JButton("Play");
	private JButton btnOpen = new JButton("Open");
	private JButton btnPause = new JButton("Pause");
	private JButton btnStop = new JButton("Stop");


	/**
	 * Create the application.
	 */
	public ViewClass() {
		createGUI();
		addComponentsFrame();
		addActionListerners();
	}

	/**
	 * Creating GUI. Here you can set bounds for your buttons and labels
	 */
	private void createGUI() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 466, 188);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		lblMusic.setBounds(6, 48, 61, 16);
		btnPlay.setBounds(6, 100, 117, 29);
		btnOpen.setBounds(349, 100, 117, 29);
		btnPause.setBounds(118, 100, 117, 29);
		btnStop.setBounds(238, 100, 117, 29);
		lblShowMusicName.setBounds(62, 48, 398, 16);
		
		mainFrame.setVisible(true);
	}
	
	/**
	 * Adding all buttons to frame
	 */
	public void addComponentsFrame(){
		mainFrame.getContentPane().add(lblMusic);
		mainFrame.getContentPane().add(btnPlay);
		mainFrame.getContentPane().add(btnOpen);
		mainFrame.getContentPane().add(btnPause);
		mainFrame.getContentPane().add(btnStop);
		mainFrame.getContentPane().add(lblShowMusicName);
	}
	/**
	 * Set the actionListerner on buttons
	 */
	public void addActionListerners(){
		btnPlay.addActionListener(this); 
		btnOpen.addActionListener(this); 
		btnPause.addActionListener(this);
		btnStop.addActionListener(this);
	}
	/**
	 * All the action performens on buttons 
	 */
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnPlay){
			playerMethods.playMusic();
			lblShowMusicName.setText(playerMethods.getFile().getName().toString());
		}
		
		if (e.getSource() == btnOpen){
			playerMethods.open();
			lblShowMusicName.setText(playerMethods.getFile().getName().toString());
		}
		
		if (e.getSource() == btnPause){
			playerMethods.pause();
		}
		
		if (e.getSource()== btnStop){
			playerMethods.stop();
		}
	}
}
