package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;

import PlayerMethods.PlayerMethods;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewClass {

	private JFrame frame;
	PlayerMethods playerMethods = new PlayerMethods();

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
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMethods.playMusic();
			}
		});
		btnPlay.setBounds(6, 100, 117, 29);
		frame.getContentPane().add(btnPlay);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMethods.open();
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
	}
}
