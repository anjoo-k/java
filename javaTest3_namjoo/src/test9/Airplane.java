package test9;

public class Airplane extends Plane {
	
	
	public void AirPlane() {
		
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	
	
	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - (distance * 3));
		
			
			
	}

	@Override
	public String toString() {
		return super.getPlaneName() + "\t\t" + super.getFuelSize();
	
	
	}

	
	
	


}
