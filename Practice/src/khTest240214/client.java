package khTest240214;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		
		try {
			
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	


}
