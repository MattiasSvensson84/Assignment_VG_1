package PlayerMethods;
import Interface.PlayerInterface;
import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface{
	
	private MP3Player mp3Player = new MP3Player();

	public MP3Player getMp3Player() {
		return mp3Player;
	}

	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	
}
