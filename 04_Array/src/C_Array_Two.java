
public class C_Array_Two {
	/* 차원 배열
	 * 자료형이 같은 1차원 배열의 묶음. 배열안에 다른 배열이 존재
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 두 개 부여
	 * (앞번호: 몇 번째 1차원 배열인지, 뒷번호: 1차원 배열의 몇 번째 index)
	 */
	public static void main(String[] args) {
//		/*
//		 * 1. 2차열 배열 선언(1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만들겠다)
//		 *    자료형 배열명[][];
//		 *    자료형[]][ 배열명;
//		 */
//		int[][] arr;
		// int[][] arr = new int[3][4];
//		
//		
//		/*
//		 * 2. 배열 할당
//		 *    배열명 = new 자료형[3][4];
//		 *    
//		 * 1차원 배열의 참조변수 묶음 먼저 생성 가능
//		 * 배열명 = new 자료형[n][];
//		 * 배열명[0] = new int[4];
//		 * 배열명[1] = new int[4];
//		 * 배열명[2] = new int[4];
//		 * 
//		 */
//		arr = new int[3][4];
//		// =
//		arr = new int[3][];
//		arr[0] = new int[4];
//		arr[1] = new int[4];
//		arr[2] = new int[4];
//		
//		/*
//		 * 배열 선언과 당시에 할당(생성과 동시에 크기지정
//		 */
//		int[][]	tmp = new int[5][5]; // 5크기의 1차원 배열을 5개 가진 2차원 배열 생성
//		
//		
//		/*
//		 *  3. 값 대입
//		 *     배열명[배열순번][인덱스] = 값;
//		 */
//		arr[0][0] = 1;
//		arr[1][1] = 2;
//		arr[2][3] = 3;
		
		
		
		
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여
		// (행, 열)값을 저장한 후 출력하세요
		
		String[][] arr = new String[3][3];
		
		for(int row = 0; row < arr.length; row++) {
			for(int colm = 0; colm < arr[row].length; colm++) {
				arr[row][colm] = "(" + row + ", " + colm + ")";
			}
		}
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
		

	}

}
