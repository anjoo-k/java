package test8;

public class User {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	
	public User() {
		super();
	}


	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password; 
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender + " " + phone;
	}
	
	
	public boolean equals(Object obj) { // Object: 매개변수 값에 어떤 객체가 와도 괜찮다.
		
		boolean isEquals = false;
		
		if(obj instanceof User) {
			User tmpUser = ((User)obj); // 이거 왜해주는거지*******************************************블로그에 정리해야징
			
			if(this.getName().equals(tmpUser.getName()) &&
				this.getId().equals(tmpUser.getId()) &&
				this.getPassword().equals(tmpUser.getPassword()) &&
				this.getAge() == tmpUser.getAge() &&
				this.getGender() == tmpUser.getGender() &&
				this.getPhone().equals(tmpUser.getPhone())) {
				isEquals = true;
			}
		}
		return isEquals;
	}
	
	public Object clone() {
		User newUser = new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
		return newUser;
		
	}
	
	
	
	
	

}
