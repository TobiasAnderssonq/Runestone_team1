
public class Server {
	public static void main(String [ ] args) {
		
		
		
		
		
		//Test code for the database
		Database db = new Database(); 
		db.populateDatabase(2, 6, 3);
		db.printDB();
		Package pack = new Package(12345,"newPackage");
		Coordinates coord = new Coordinates(1,2,2);
		Shelf newShelf = new Shelf(pack, coord);
		db.storePackage(newShelf);
		db.printDB();
	}
}
