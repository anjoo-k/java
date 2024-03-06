package test9;

/**
 * 추상메서드!!
 * 상속, 다형성 오버라이딩
 */
public class PlaneTest {
	
	public static void main(String[] args) {
		 
		Plane ap = new Airplane("L747", 1000);
		Plane cp = new Cargoplane("C40", 1000);
		
		
		System.out.println("Plane\t\tfuelSize" );
		System.out.println("-------------------------");
		System.out.println(ap.toString());
		System.out.println(cp.toString());
		System.out.println("100 운항");
		ap.flight(100);
		cp.flight(100);
		System.out.println("Plane\t\tfuelSize" );
		System.out.println("-------------------------");
		System.out.println(ap.toString());
		System.out.println(cp.toString());
		ap.refuel(200);
		cp.refuel(200);
		System.out.println("Plane\t\tfuelSize" );
		System.out.println("--------------------------");
		System.out.println(ap.toString());
		System.out.println(cp.toString());
		
		
		
		
		
	}

}
