import java.io.IOException;
import java.util.Vector;

public class Server {
	public static void main(String [ ] args) {
		
		BluetoothDeviceFinder finder = new BluetoothDeviceFinder();
		
		Vector vect = new Vector();
		try {
			vect = finder.findDevices();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test code for the database
		/*Database db = new Database(); 
		db.populateDatabase(2, 6, 3);
		db.printDB();
		Package pack = new Package(12345,"newPackage");
		Coordinates coord = new Coordinates(1,2,2);
		Shelf newShelf = new Shelf(pack, coord);
		db.storePackage(newShelf);
		db.printDB();*/
	}
}
