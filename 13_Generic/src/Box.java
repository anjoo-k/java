
public class Box <T> {
	/*
	 * 클래스를 정의할 때 타입을 정해주지않고 임의의 값으로 지정
	 * 해당 타입은 실제 객체가 생성될 때 정의
	 * 
	 */
	
	private T[] ob; // 뭘 담을지 => 객체
	private int size; // 크기
	
	
	
	public Box() {
		super();
	}



	public T[] getOb() {
		return ob;
	}



	public void setOb(T[] ob) {
		this.ob = ob;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "Box [ob=" + ob + ", size=" + size + "]";
	}

	
	
	

}
