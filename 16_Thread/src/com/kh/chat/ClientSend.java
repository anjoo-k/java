package com.kh.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend implements Runnable {


private Socket socket;
	
	public ClientSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try (PrintWriter pw = new PrintWriter(socket.getOutputStream()); // try()안에 두 개 이상 넣기 가능
				Scanner sc = new Scanner(System.in)) {
			
			
			
			while(true) {
				String message = sc.nextLine();
				pw.println(); // 버퍼에 담김
				pw.flush(); // 버퍼에 담은걸 밀어서 저쪽으로 넘겨줘
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
		
	
	
}
