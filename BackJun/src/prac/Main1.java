package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());


		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] board = new char[n][m];

		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		//--------------- 여기까지가 입력 받기 -----------------



		int count = 0, count1 = 0;
		int min = m*n;
		int tmp1 = 0, tmp2 = 0;
		
		
		for(int row = 0; row <= (n-8); row++) {
			for(int col = 0; col <= (m-8)  ; col++) {
				
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {//난바보야
						if((i + j) % 2 == 0) { 
							count = (board[row + i][col + j] != 'B') ? count + 1: count;
						} else {
							count = (board[row + i][col + j] == 'B') ? count + 1: count;
						}
						tmp1 = Math.min(count, min);
						
					}
				}

			}
		}
		
		
		
		for(int row = 0; row <= (n-8); row++) {
			for(int col = 0; col <= (m-8)  ; col++) {
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if((i + j) % 2 == 0) { 
							count1 = (board[row + i][col + j] != 'W') ? count1 + 1: count1;
						} else {
							count1 = (board[row + i][col + j] == 'W') ? count1 + 1: count1;
						}
						tmp2 = Math.min(count1, min);

					}
				}
			}
		}
		
		int temp = Math.min(tmp1, tmp2);
		System.out.println(tmp1 + "+" + count);
		System.out.println(tmp2 + "+" + count1);
		System.out.println(temp);



		
		
		
	
		/*
		 * 그니까 내가 원하는 체스판은 8 * 8임
		 * 실제 가지고 있는 판은 가로가 n(행), 세로가 m(열)
		 * 
		 * n*m 체스판에서 내가 원하는 부분을 제외한 나머지 부분 : n-8 * m-8(8*8을 세트로 만든것)
		 * 남는판의 부분에 반복문을 돌려서 
		 * 그 8*8 안에 들어오는 부분들 안에서 바꿔야할 돌 갯수를 알아야 하니까
		 * 또 반복문을 돌려서 바꿔야할 갯수를 알아내고
		 * 그 중에 가장 바꿔야할 갯수가 적은 판에서 바꾼 갯수를 알아내면 됨 
		 * 바꿔야할 갯수는 (0,0), (0,2), (0,4),...
		 * 			   (1,1), (1,3), (1,5),...
		 * 			   (2,0), (2,2), (2,4),...
		 * 이런 규칙성이 있다.
		 * 
		 * */
		
		
	
	
//	private static char[][] board;
//	
//	public static void main(String[] args) throws IOException {
//
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		int n = Integer.parseInt(st.nextToken()); // 가로
//		int m = Integer.parseInt(st.nextToken()); // 세로
//
//		board = new char[n][m];
//
//		for(int i = 0; i < n; i++) {
//			board[i] = br.readLine().toCharArray();
//		}
//		int min = m * n; // 보드를 돌아서 칠하는 횟수의 최솟값, 보드 전체를 바꾸는 것 보다 클 수 없음
//		for(int row = 0; row <= n - 8; row++) {
//			for(int col = 0; col <= m - 8; col++) { // 8*8 세트를 가지고 돌아돌아
//				
//				int tmp = Math.min(get('B', row, col), get('W', row, col)); // 둘 중에 뭐가 최소냐
//				min = Math.min(min, tmp);
//			}
//		}
//		
//		System.out.println(min);
//		br.close();
//		
//	}
//	
//	public static int get(char color, int row, int col) { // 변경해야하는 돌의 갯수
//		int count = 0;
//		for(int i = 0; i < 8; i++) {
//			for(int j = 0; j < 8; j++) {
//				if((i + j) % 2 == 0) {
//					count = (board[row + i][col + j] != color) ? count + 1: count;
//				} else { 
//					count = (board[row + i][col + j] == color) ? count + 1: count;
//				}
//			}
//		}
//		return count;
	}

}

