package test9;

public class Cargoplane extends Plane {
	
	
	public Cargoplane() {
		
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	

	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - (distance * 5));
	}

	@Override
	public String toString() {
		return super.getPlaneName() + "\t\t" + super.getFuelSize();
	
	}

}
