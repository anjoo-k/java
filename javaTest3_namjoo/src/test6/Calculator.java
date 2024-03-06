package test6;

public class Calculator {
	public double getSum(int data) throws InvalidException {
		
		if(data > 5 || data < 2) {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		double sum = 0;
		for(int i = 0; i <= data; i++) {
		sum += i;
	}		
			return sum;
			
			
	}
}
