package Shape;

import java.awt.Color;
import Jeu.TetrisBlock;

public class TShape extends TetrisBlock {

	Color color=Color.MAGENTA;
public TShape() {
		
		super(new int [][] {
			
			
		{1,1,1},
		{0,1,0},
						
		});
		
	}
@Override
public Color getColor() {
	return color;
}
}
