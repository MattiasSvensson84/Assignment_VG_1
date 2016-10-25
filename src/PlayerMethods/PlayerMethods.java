package PlayerMethods;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import GUI.ViewClass;
import Interface.PlayerInterface;
import jaco.mp3.player.MP3Player;
/**
 * 
 * @author Mattias Svensson
 *
 * Class PlayerMethods with implements from Playerinterface
 * The class includes all methods that for executing actions.
 * It also has an instants of the class MP3Player 
 */

public class PlayerMethods implements PlayerInterface{
	
	private MP3Player mp3Player = new MP3Player();
	private File file = new File("");
	
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	public PlayerMethods(){
		super();
	}
	/**
	 * Getter for the variable mp3Player
	 * @return mp3Player
	 */
	public MP3Player getMp3Player() {
		return mp3Player;
	}
	/**
	 * Setter for the variable mp3Player
	 * @param mp3Player
	 */
	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}
	
	/**
	 * Method for playing music
	 *  If you didnt choose any file you should get open method to choose file
	 */
	@Override
	public void playMusic() {
		if (file.getName() == "") {
			open();
		
			
		}else  {
		
			mp3Player.play();
		}
			
	}
	/**
	 * Method for open and choose a file that is a song 
	 * It includes filter for just to show files with mp3 format
	 * The method stops the song thats playing and start a new when a mp3 file is choosen
	 */
	@Override
	public void open() {
		System.out.println(getFile());
		JFileChooser chooserMp3File = new JFileChooser();
		  FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "MP3 Files", "mp3");
			    chooserMp3File.setFileFilter(filter);
			    
			    int returnVal = chooserMp3File.showOpenDialog(null);
			    
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	
			    	file = chooserMp3File.getSelectedFile();
			    	mp3Player.stop();
			    	mp3Player = new MP3Player(file);
			    	setFile(file);
			    	mp3Player.play();
			    	System.out.println(getFile().getName());	
			    
			    }
		   
		
	}
	/**
	 * Method for pause from playing music
	 * when pause and you press play again the song should start from where it was pause
	 */
	@Override
	public void pause() {
		mp3Player.pause();
		
	}
	/**
	 * Method for stop from playing music
	 */
	@Override
	public void stop() {
		mp3Player.stop();
		
	}

	
}
