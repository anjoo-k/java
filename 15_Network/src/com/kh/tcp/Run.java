package com.kh.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	/**
	 *  * 네트워크: 여러대의 컴퓨터들이 연결되어있는 통신망
	 *  		=> 네트워크 통해 서로 데이터를 교환하기 위해서
	 *  
	 *  IP 주소 : 네트워크상에 각 컴퓨터를 식별해 줄 수 있는 번호(실제 주소)
	 *  
	 *  * 서버와 클라이언트
	 *  (서버) 클라이언트(고객)에게 서비스 제공하는 프로그램 또는 컴퓨터(클라이언트 요청에 응답)
	 *  (클라이언트) 서버에 요청을 하는 컴퓨터(서비스를 제공받는 고객)
	 *  
	 *  서버에 요청하기 위해서는?
	 *   → 요청하려고 하는 서버의 IP 주소(또는 도메인), 포트번호(문이라고 생각하면 됌)를 알아야 한다.
	 *   
	 *   
	 *  * 현재 구동중인 서버가 있을 때
	 *    클라이언트는 서버로 요청을 보낼 수 있고
	 *    => 응답 결과가 돌아온다
	 *    
	 *    1. '요청'과 '응답'에 의해 '웹'이 작동된다(= 통신한다)
	 *    2. 웹에서의 통신방식 : HTTP 프로토콜 사용
	 *    
	 *    
	 *   * 자바만 가지고 서버와 클라이언트간에 간단한 통신해보기!
	 *     이 때 데이터를 입출력하고자 하면 서버와 클라이언트간에 스트림(연결통로)이 필요
	 *   
	 *   * 소켓 : 프로세스간 통신 담당
	 *    1. 소켓 프로그래밍 TCP / UDP
	 *      (TCP) 데이터 전송 속도가 느림, 데이터가 정확하고 안정적으로 전달 가능(신뢰성↑)
	 *      (UDP) 데이터 전송 속도가 빠름, 신뢰성 없는 데이터 전달에 용이(속도↑)
	 *      
	 *        
	 *        
	 */

	// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스,
	public static void main(String[] args) {
		try { // 객체를 가져와서 쓰는 것
			InetAddress localhost = InetAddress.getLocalHost();  // 내 PC(지역호스트)에 대한 정보 반환
			//내 컴퓨터 ip 받아줌
			System.out.println(localhost); // 내 PC명 + / + 내 ip 주소
			System.out.println("내 PC명 : " + localhost.getHostName()); // 호스트 이름 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress()); //호스트의 ip 주소 반환
		
			System.out.println("=======================================");
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // 도메인명을 통해 해당 호스트 정보 가져올 수 있다.
			System.out.println("구글의 서버명 : " + googleHost.getHostName());
			System.out.println("구글의 IP주소 : " + googleHost.getHostAddress());
			
			System.out.println("=======================================");
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버의 호스트 갯수 : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소 : " + n.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
