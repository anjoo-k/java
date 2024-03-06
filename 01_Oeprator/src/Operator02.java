
public class Operator02 {
	/*
	 * 증감연산자
	 * ++ : 변수에 담긴 값을 1 증가시켜 주는 연산자
	 * 		++변수, 변수++
	 * -- : 변수에 담긴 값을 1 감소시켜 주는 연산자
	 * 		--변수, 변수--
	 * 
	 *  (증감연산자)변수 : 전위연산 => "선증감" 후 처리
	 *  변수(증감연산자) : 후위연산 => 선처리 "후증감"	 * 
	 */
	
	public static void main(String[] args) {
		
		int num1 = 0;
		
		System.out.println(num1++); //1 but 0 : 먼저 0 찍고 출력하고 0 + 1 증가
		System.out.println(--num1); //0 : 1 - 1 찍고 출력
		System.out.println(--num1); //-1 : 0 - 1 찍고 출력
		System.out.println(num1--); //-2 : -1 출력하고 (-1) - 1 감소
		System.out.println(num1++); //-1
		System.out.println(++num1); //0
		System.out.println(++num1); //1
		System.out.println(num1++); //2
		
		// 0 0 -1 -1 -2 0 1 1  
		
	}

}
