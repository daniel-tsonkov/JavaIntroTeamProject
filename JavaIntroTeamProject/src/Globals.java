/* This class holds all the global variables and 
 * constants so that they can be referenced or
 * modified by all other classes/methods.
 */


public class Globals {
	
	// constants - these are not changed during execution
	public static int GridSizeX = 5;
	public static int GridSizeY = 5;
	public static int EmptySpace = 0;
	public static int Wall = -1;
	public static int Apple = -2;
	
	
	// vars - these can be changed during execution
	public static int[][] GlobalGrid = new int[GridSizeX][GridSizeY];
}
