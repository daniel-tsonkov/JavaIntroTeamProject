
public class CommonMethods {
	
	
	
	public static void globalGrid0() {
		/* The only purpose of this method is to equate all
		 * values of Globals.GlobalGrid to 0. It is to be used
		 * in the beginning of a game to reset the GlobalGrid
		 * before being populated with all the objects.
		 */
		
		for (int i = 0; i < Globals.GridSizeY; i++) {
			for (int j = 0; j < Globals.GridSizeX; j++) {
				Globals.GlobalGrid[j][i] = Globals.EmptySpace;
			}
		}
	}
	
	
	public static int checkValueOfCell(int x, int y) {
		/* This method checks the valye of a cell, given
		 * X and Y coordinates as ints and returns the 
		 * cell value (-2, -1, 0, 1, etc.)
		 */
		
		
		int result = 0;
		
		if (x < Globals.GridSizeX && y < Globals.GridSizeY) {
			result = Globals.GlobalGrid[x][y];
		}
		
		return(result);
	}

}
