package vehicles;

public class CPlane extends CVehicle {
	private double height;
	private double passengers;
	
	public CPlane(Ñoordinates coordinates, double price, double speed, double year, double height, double passengers) {
		super(coordinates, price, speed, year);
		this.height = height;
		this.passengers = passengers;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPassengers() {
		return passengers;
	}

	public void setPassengers(double passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {		
		return "CPlane [coordinates=" + coordinates + ", price=" + price + "uah, speed=" + speed + "km/h, year=" + year + "height=" + height + "km, passengers=" + passengers + "]";
	}
	
	
	
	
}
