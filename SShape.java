package Shape;

import java.awt.Color;
import Jeu.TetrisBlock;

public class SShape extends TetrisBlock {

	Color color=Color.green;
public SShape() {
		
		super(new int [][] {
			
			
		{0,1,1},
		{1,1,0},
						
		});
		
	}
@Override
public Color getColor() {
	return color;
}
}
