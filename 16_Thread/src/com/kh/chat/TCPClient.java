package com.kh.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] arge) {
		
		
		try {
			Socket socket = new Socket("localhost", 3000);  // localhost 는 무조건 내 ip
			
			
			// 서버로부터 메세지를 받는 쓰레드
			ClientRecieve recieve = new ClientRecieve(socket);
			Thread t1 = new Thread(recieve);
			t1.start();
			
			// 서버에 메세지를 보내는 쓰레드
			ClientSend send = new ClientSend(socket);
			Thread t2 = new Thread(send);
			t2.start();
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
