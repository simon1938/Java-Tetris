package Jeu;

public class GameThread extends Thread {
	
	AudioPlayer audio = new AudioPlayer();
	private GameArea gameArea;
	private GameForm gf;
	private int score;
	private int level=1;
	private int scorePerLevel=3;
	private int pause = 500 ;
	private int speedupPerLevel=100;
	
	public GameThread(GameArea gameArea,GameForm gf) {
		this.gameArea=gameArea;
		this.gf=gf;
	}
	
	@Override
	public void run() {
		audio.soundingame();
		while(11==11) {
			
		gameArea.spawBlock();
		
		
				
		
		while (gameArea.moveBlockDown()) {
			
			
		try {
			
			Thread.sleep(pause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		if(gameArea.isBlockOutOfBounds()) {
			audio.playGameover();
			System.out.println("game over");
			break;
		}
		gameArea.moveBlockToBackground();
		score+=gameArea.clearLines();
		gf.updateScore(score);
		int lvl=score/scorePerLevel+1;
		if(lvl>level) {
			level=lvl;
			gf.updateLevel(level);
			pause-=speedupPerLevel;
		}
		
		
		
	}
	
	}

}