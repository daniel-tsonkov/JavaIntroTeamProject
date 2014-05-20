import java.util.Random;


public class SpawnObjects {
	
	
	/* This method will spawn an apple on a random place
	 * on the global grid, but only if it is not occupied by
	 * anything else. To do that we utilize the generic
	 * method to put any object on an empty space, only the
	 * value is taken from the global Apple variable.
	 */
	
	public static void spawnApple() {
		
		putObjectOnGlobalGrid(Globals.Apple, pickRandomEmptySpace(countEmptySpaces()));
		
	}
	
	
	
	public static int countEmptySpaces() {
		
		int emptySpaceCounter = 0;
		
		for (int i = 0; i  < Globals.GridSizeY; i++) {
			for (int j = 0; j  < Globals.GridSizeX; j++) {
				if (Globals.GlobalGrid[j][i] == 0) {
					emptySpaceCounter++;
				}
			}
		}
		return(emptySpaceCounter);
	}
	
	
	
	public static int pickRandomEmptySpace(int upperLimit) {
		Random randomNumber = new Random();
		int returnRandomNumber = randomNumber.nextInt(upperLimit+1);
		return(returnRandomNumber);
	}
	
	
	
	/* This method needs debugging as it
	 * places objects on non-zero grid places
	 */
	
	public static void putObjectOnGlobalGrid(int objectID, int position) {
		
		int counter = 0;
		
		for (int i = 0; i  < Globals.GridSizeY; i++) {
			for (int j = 0; j  < Globals.GridSizeX; j++) {
				if (Globals.GlobalGrid[j][i] == 0 && counter == position) {
					Globals.GlobalGrid[j][i] = objectID;
					return;
				}
				else {
					counter++;
				}
			}
		}
	}
	

}
