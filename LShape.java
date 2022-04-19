package Shape;

import java.awt.Color;
import Jeu.TetrisBlock;

public class LShape extends TetrisBlock {

	Color color=Color.orange;
public LShape() {
		
		super(new int [][] {
			
			
		{1,0},
		{1,0},
		{1,1},
						
		});
		
	}
@Override
public Color getColor() {
	return color;
}
}
