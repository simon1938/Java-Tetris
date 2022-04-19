package Shape;

import java.awt.Color;

import Jeu.TetrisBlock;

public class ZShape extends TetrisBlock {

	Color color=Color.red;
public ZShape() {
		
		super(new int [][] {
			
			
		{1,1,0},
		{0,1,1},
						
		});
		
	}
@Override
public Color getColor() {
	return color;
}
}
