import java.util.ArrayList;

public class Database {
	
	private ArrayList<Shelf> list = new ArrayList<Shelf>();
	
	
	public ArrayList<Shelf> getListOfShelves() {
		return this.list;
	}
	
	public void storePackage(Shelf newShelf) {
		//TODO
	}
	
	public Coordinates getPackageLocation(String packageName) {
		return null;
		//TOOD
	}
	
	public Coordinates getPackageLocation(int packageID) {
		return null;
		//TODO
	}


}
