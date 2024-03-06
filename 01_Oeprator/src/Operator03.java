
public class Operator03 {
		
		/* 산술연산자 (이항 연산자 == 두개의 값을 가지고 연산한다)
		 * +, -, *, /, %
		 * 
		 * * % / > + - 
		 * 
		 * 복합 대입 연산자
		 * 산술연산지와 대입연산자가 결합되어있는 형태
		 * 연산처리 속도가 빨라지므로 사용하는 걸 권장!
		 * 
		 * += -= /= *= %=
		 * 
		 * a = a + 3;  =>  a += 3;
		 * a = a - 3;  =>  a -= 3;
		 * a = a * 3;  =>  a *= 3;
		 * a = a / 3;  =>  a /= 3;
		 * a = a % 3;  =>  a %= 3;
		 */
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		// *** 증감 연산지 이해! ***
		// &&& ***** 산술연산자를 쓰면 본래의 값에 영향을 미친다!!!!!!!!!!! *********
		
		int c = (++a) + b; // a 6, b 10 = c 16
		int d = c / a; // c 16, a 6 = d 2
		int e = c % a; // c 16, a 6 = e 4
		int f = e++; // e 4 = f 4 하고 ++ 해서 e 5 된다
		int g = (--b) + (d--); // b 9, d 2 = g 11 하고 --해서 d 1
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// 	 a 6, b 9, c 16, d 1, e 5, f 4, g 11, h 2 : 계산할 때
		// ->a 7, b 9, c 15, d 1, e 6, f 4, g 10, h 2  : 계산 후 값들
		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		System.out.println("a : " + a); //
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
	}

}
