package Jeu;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {

	private String soundsFolder = "tetris sound"+File.separator;
	private String clearLinePath = soundsFolder+"line.wav";
	private String gameoverPath = soundsFolder+"success.wav";
	private String soundingamePath = soundsFolder+"tetris-theme-officiel.wav";
	
	private Clip clearLineSound,gameoverSound,soundingamesound;
	
	public AudioPlayer() {
		
	try {
		
		clearLineSound=	AudioSystem.getClip();
		gameoverSound=	AudioSystem.getClip();
		soundingamesound = AudioSystem.getClip();
		
			clearLineSound.open(AudioSystem.getAudioInputStream( new File(clearLinePath).getAbsoluteFile() ));
			gameoverSound.open(AudioSystem.getAudioInputStream( new File(gameoverPath).getAbsoluteFile() ));
			soundingamesound.open(AudioSystem.getAudioInputStream( new File(soundingamePath).getAbsoluteFile()));
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public void playClearLine() {
		
		clearLineSound.setFramePosition(0);
		clearLineSound.start();
	}
	public void playGameover(){
		gameoverSound.setFramePosition(0);
		gameoverSound.start();
	}
	
	public void soundingame() {
		soundingamesound.setFramePosition(0);
		soundingamesound.start();
	}
	
}
