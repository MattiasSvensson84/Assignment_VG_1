package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;

import PlayerMethods.PlayerMethods;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
/**
 * 
 * @author Mattias Svensson
 * 
 * Class for user interface. includes design on all the buttons and actions on them
 */
public class ViewClass {

	private JFrame frame;
	private PlayerMethods playerMethods = new PlayerMethods();
	private JLabel lblShowMusicName = new JLabel("");

	/**
	 * Launch the application.
	 */
	public  void runPlayer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClass window = new ViewClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. Buttons and actions on them
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusic = new JLabel("Music: ");
		lblMusic.setBounds(6, 48, 61, 16);
		frame.getContentPane().add(lblMusic);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMethods.playMusic();
				lblShowMusicName.setText(playerMethods.getFile().getName().toString());
			}
		});
		btnPlay.setBounds(6, 100, 117, 29);
		frame.getContentPane().add(btnPlay);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playerMethods.open();
				lblShowMusicName.setText(playerMethods.getFile().getName().toString());
				
			}
		});
		btnOpen.setBounds(349, 100, 117, 29);
		frame.getContentPane().add(btnOpen);
		
		JButton btnNewButton = new JButton("Pause");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMethods.pause();
				
			}
		});
		btnNewButton.setBounds(118, 100, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stop");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMethods.stop();
			}
		});
		btnNewButton_1.setBounds(238, 100, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		
		lblShowMusicName.setBounds(62, 48, 398, 16);
		frame.getContentPane().add(lblShowMusicName);
			
	}
}
