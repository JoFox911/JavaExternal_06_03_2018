package vehicles;

public class CCar extends CVehicle {

	public CCar(Ñoordinates coordinates, double price, double speed, double year) {
		super(coordinates, price, speed, year);
	}

	@Override
	public String toString() {
		return "CCar [coordinates=" + coordinates + ", price=" + price + "uah, speed=" + speed + "km/h, year=" + year + "]";
	}
	
}
