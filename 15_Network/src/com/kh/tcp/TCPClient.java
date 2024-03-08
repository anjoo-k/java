package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int port = 3000;
		String serverIP = "192.168.30.20";
		
		
		
		try {
			
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				System.out.println("서버와 연결");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter os = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.println("보낼메시지:");
					String send = sc.nextLine();
					os.println(send);
					os.flush();
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메세지 :" + br.readLine());
					
					
				}
				
				
				
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
//		BufferedReader br = null; // 한줄씩 가져오기 위해..?
//		PrintWriter pw = null;
//		
//		Socket socket = null;
//		
//		// 요청하고자하는 서버 IP : 192.168.30.20
//		// 포트번호 : 3000
//		
//		int port = 3000;
//		String serverIP = "192.168.30.20";
//		
//		try {
//			// 1) 서버에 연결 요청 보내는 구문(요청하고자 하는 서버의 IP주소와 지정된 포트 번호 제시해주면 된다.)
//			socket = new Socket(serverIP, port);
//			// 통신 실패 : null값이 socket에 담긴다.
//			
//			if(socket != null) { // 서버와 잘 연결된 경우
//				System.out.println("서버와 연결 성공!");
//				
//				// 2) 서버와 입출력기반 스트림 생성
//				// 3) 보조스트림활용해 성능 개선
//				
//				// 입력용 스트림
//				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				
//				//출력용 스트림
//				pw = new PrintWriter(socket.getOutputStream());
//				
//				
//				while(true) {
//					// 4) 스트림을 통해 읽고 쓰기
//					System.out.println("서버에게 보낼 내용 : ");
//					String sendMessage = sc.nextLine();
//					pw.println(sendMessage);
//					pw.flush();
//					
//					String message = br.readLine();
//					System.out.println("서버로부터 전달받은 메세지 : " + message);
//					
//				}
//			}
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//			try {
//				br.close();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//
//		}
		sc.close();
		
	
		
		
		
	}
	
	

}
