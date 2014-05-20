
public class Snake {

	public static void main(String[] args) {
		
		/* for now used just for testing purposes */
		
		CommonMethods.globalGrid0();
		
		SpawnObjects.spawnApple();
		SpawnObjects.spawnApple();
		SpawnObjects.spawnApple();
		SpawnObjects.spawnApple();
		SpawnObjects.spawnApple();
		SpawnObjects.spawnApple();
		
		for (int i = 0; i < Globals.GridSizeY; i++) {
			for (int j = 0; j < Globals.GridSizeX; j++) {
				System.out.print(Globals.GlobalGrid[j][i]);
			}
			
			System.out.print("\n");
		}
	}
	
	
	
	

}
