package Shape;

import java.awt.Color;
import Jeu.TetrisBlock;

public class JShape extends TetrisBlock {
	
	Color color=Color.blue;
	
	public JShape() {
		
		super(new int [][] {
			
			
		{0,1},
		{0,1},
		{1,1},
						
		});
		
	}
	@Override
	public Color getColor() {
		return color;
	}
	
	
}
