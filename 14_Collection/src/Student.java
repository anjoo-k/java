
public class Student {
	
	private String name;
	private int age;
	private int score;
	
	
	public Student() {
		super();
	}


	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}


	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환
		String str = name + age + score;
		return str.hashCode();
	}


	// Sudent.equals(Student 객체) 와 같은 방식으로 호출될 것
	@Override
	public boolean equals(Object obj) { // 현재객체와 전달받은 객체의 각 필드값이 모두 일치하면 true/하나라도 일치하지 않으면 false
		// this(현재객체)      ←→      obj(전달받은 객체)
		//   Student					Object 타입
		
		if(obj instanceof Student) {
			Student other = (Student) obj;
			if(this.getName().equals(other.getName()) &&
					this.getAge() == other.getAge() &&
					this.getScore() == other.getScore()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	
	}
	
	

}
