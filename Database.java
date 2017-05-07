import java.util.ArrayList;

public class Database {
	
	private ArrayList<Shelf> list = new ArrayList<Shelf>();
	
	
	public ArrayList<Shelf> getListOfShelves() {
		return this.list;
		
	}
	
	public void storePackage(Shelf newShelf) {
		for(int i = 0; i < list.size(); i++) {
			if(Coordinates.compareCoordinates(newShelf.getCoordinates(), list.get(i).getCoordinates())) {
				list.set(i, newShelf);
			}
		}
	}
	
	public Coordinates findEmptySlot() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPackage() == null) {
				return list.get(i).getCoordinates();
			}
		}
		return null;
	}
	
	public Coordinates getPackageLocation(String packageName) {
		return null;
		//TOOD
	}
	
	public Coordinates getPackageLocation(int packageID) {
		return null;
		//TODO
	}
	
	public void populateDatabase(int rows, int shelvesPerRow, int shelfHeight) {
		
		for(int i = 0; i < rows; i++) {
			for(int k = 0; k < shelvesPerRow; k++) {
				for(int j = 0; j < shelfHeight; j++) {
					Coordinates coord = new Coordinates(i,k,j);
					Shelf newShelf = new Shelf(null,coord);
					list.add(newShelf);
				}
			}
		}
		
		
	}
	
	public void printDB() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPackage() + " " + list.get(i).getCoordinates().x + 
					" " + list.get(i).getCoordinates().y + " " + list.get(i).getCoordinates().z);
		}
		
	}


}
