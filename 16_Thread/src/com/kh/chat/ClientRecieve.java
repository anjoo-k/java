package com.kh.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRecieve implements Runnable  {
	
	private Socket socket;
	
	public ClientRecieve(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {


			while(true) {
				String message = br.readLine();
				System.out.println("서버로부터 전달된 메세지 : " + message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

}
