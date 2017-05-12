import java.net.ServerSocket;
import java.net.Socket;

import lejos.utility.Delay;

import java.io.*;
/**
 * Class for controlling a EV3 robot
 * @author Alex
 */

public class Robot {
	
	private DataInputStream inputStream; 
	private DataOutputStream outputStream; 
	
	public Robot() {
		
	}
	/**
	 * Connect the robot to the server using sockets. The server and the robot need to be in the same Bluetooth PAN network. 
	 * @param port Port number of server's socket. 
	 * @throws IOException
	 */
	public void connectToServer(int port) throws IOException {
		ServerSocket serv = new ServerSocket(port);
		Socket s = serv.accept(); //Wait for Laptop to connect
		this.inputStream = new DataInputStream(s.getInputStream());
		this.outputStream = new DataOutputStream(s.getOutputStream());
		System.out.println("Socket connected");
	}
	
	/**
	 * Reads characters from server until 'e' is returned. Prints them out if they return true when passed as arguments to isValidCommond.  
	 * @return the last read character from server
	 */
	public char readCharFromServer() {
		char msgFromServer = '0';
		while (msgFromServer != 'e') {
			//Test msg from laptop
			try {
				msgFromServer = inputStream.readChar();
				if (this.isValidCommand(msgFromServer)){
					System.out.print(msgFromServer);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Did not receive message from server");
				e.printStackTrace();
			}
		}
		return msgFromServer; 
	}
	
	/**
	 * Check if command is a valid character (one of 'w', 'a', 's' or 'd'). 
	 * @param command a character that should be checked if it is a valid character.
	 * @return true if command is a valid character. 
	 */
	public boolean isValidCommand(char command) {
		String legalCommands = "wasd"; 
		return legalCommands.contains(Character.toString(command));
		
	}
	
	private void move(boolean direction, int intersections) {
		
	}
	/**
	 * Connect to server and receive characters. Prints the character if 'w', 'a', 's' or 'd' is received. Exits when 'e' is received. 
	 * @param args 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Program started");
		Robot client = new Robot();
		client.connectToServer(1111);
		char msgFromServer = client.readCharFromServer();
		if (client.isValidCommand(msgFromServer)) {
			System.out.print(msgFromServer);
		}
		
		
		
	};
	
};
