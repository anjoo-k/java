package com.kh.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] arge) {
		
		int port = 3000;
		try {
			
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("서버연결준비완료...");
			
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			
			
			// 클라이언트로부터 메세지 받는 입력 쓰레드
			ServerRecieve receive = new ServerRecieve(socket);
			Thread receiveTask = new Thread(receive);
			receiveTask.start();
			
			// 클라이언트로 메세지 보내는 출력 쓰레드
			ServerSend send = new ServerSend(socket);
			Thread sendTask = new Thread(send);
			sendTask.start();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		BufferedReader br = null;
//		PrintWriter pw = null;
//		
//		// 1) 포트번호 지정(서버측에서 몇번 포트로 통로를 열겠냐? 라는 의미)
//		int port = 3000;
//		
//		ServerSocket server;
//		try {
//			// 2) ServerSocket 객체 생성 시 포트 결합(Bind)
//			server = new ServerSocket(port);
//			
//			// 3) 클라이언트로부터 접속 요청이 올 때까지 대기
//			System.out.println("클라이언트 요청을 기다리고 있습니다.");
//			
//			// 4) 연결 요청이 오면 => 요청 수락 후 클라이언트와 통신할 수 있는 서버측 소켓객체 생성
//			Socket socket = server.accept();
//			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
//			
//			// 5) 클라이언트와 입출력 기반스트림 생성(바이트스트림만 됌)
//			// 6) 보조스트림 통한 성능개선 필요
//			
//			// 입력용 스트림 (클라이언트로부터 전달된 값을 한줄 단위로 읽어들이기 위한 입력용 스트림)
//			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			
//			//출력용 스트림 (클라이언트에게 값을 한 줄 단위로 출력할 수 있는 출력용 스트림)
//			pw = new PrintWriter(socket.getOutputStream());
//			//PrintWriter : 데이터 출력 시 print(), println() 메소드를 가지고 있는 보조스트림
//			
//			while(true) {
//				// 7) 스트림을 통해서 읽고 쓰기
//				String message = br.readLine();
//				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
//				
//				// 반대로 클라이언튼에게 데이터 전달(출력)
//				System.out.println("클라이언트에게 보낼 내용 : ");
//				String sendMessage = sc.nextLine();
//				
//				pw.println(sendMessage); // 클라이언트에게 출력
//				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		sc.close();
	}
	

}
