package khTest240214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int port = 3000;
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			Socket client = server.accept();
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			
			while(true) {
				String getMessage = br.readLine();
				System.out.println("클라이언트:" + getMessage);
				
				System.out.println("서버:");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
		sc.close();
	}
}
