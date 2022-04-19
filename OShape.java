package Shape;

import java.awt.Color;
import Jeu.TetrisBlock;

public class OShape extends TetrisBlock {

	Color color=Color.YELLOW;
public OShape() {
		
		super(new int [][] {
			
			
		{1,1},
		{1,1},
						
		});
		
	}
@Override
public Color getColor() {
	return color;
}
}
