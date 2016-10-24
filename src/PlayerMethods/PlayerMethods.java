package PlayerMethods;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Interface.PlayerInterface;
import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface{
	
	private MP3Player mp3Player = new MP3Player();
	
	public PlayerMethods(){
		super();
	}

	public MP3Player getMp3Player() {
		return mp3Player;
	}

	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	@Override
	public void playMusic() {
		mp3Player.play();
		
	}

	@Override
	public void open() {
		
		JFileChooser chooserMp3File = new JFileChooser();
		  FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "MP3 Files", "mp3");
			    chooserMp3File.setFileFilter(filter);
			    
			    int returnVal = chooserMp3File.showOpenDialog(null);
			    
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	
			    	File file = chooserMp3File.getSelectedFile();
			    	mp3Player.stop();
			    	//lblMusicText.setText(file.getName().toString());
			    	mp3Player = new MP3Player(file);
			    	mp3Player.play();
			    	
			    }
		   
		
	}

	@Override
	public void pause() {
		mp3Player.pause();
		
	}

	@Override
	public void stop() {
		mp3Player.stop();
		
	}

	
}
