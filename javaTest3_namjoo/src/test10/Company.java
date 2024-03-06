package test10;

public class Company {

	/**
	 * 다형성 오버라이딩
	 */
	public static void main(String[] args) {
		
		
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.printf("%-10s %-15s %-30s\n", "name", "deparetment", "salary");
		System.out.println("--------------------------------------------");
		
		for(int i = 0; i < employees.length; i++) {
			Employee e = employees[i];
			System.out.printf("%-10s %-15s %-30s\n", e.getName(), e.getDepartment(), e.getSalary() );
		}
		
		System.out.println("\n인센티브 100 지급\n");

		
		
		System.out.printf("%-10s %-15s %-10s %-10s\n", "name", "deparetment", "salary", "tax");
		System.out.println("--------------------------------------------");
		for(Employee e : employees) {
			if(e instanceof Secretary) {
				((Secretary)e).incentive(100);;
		} else if(e instanceof Sales) {
				((Sales)e).incentive(100);;
			}
			System.out.printf("%-10s %-15s %-10s %-10s\n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());

		}

	
	}

	}
