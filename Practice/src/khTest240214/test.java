package khTest240214;

public class test {
	public static void main(String[] args) {
		
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("길동");

		pArr[1] = new Person("호동");

		pArr[2] = new Person("재석");
		
		for(int i = 0; i < pArr.length; i++) {

			System.out.println(pArr[i].getName());
		}
		
	}

}


