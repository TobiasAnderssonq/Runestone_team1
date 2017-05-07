
public class Coordinates {
	
	public int x,y,z;
	
	public Coordinates(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static boolean compareCoordinates(Coordinates coord1, Coordinates coord2) {
		return coord1.x == coord2.x && coord1.y == coord2.y && coord1.z == coord2.z;
	}
}
