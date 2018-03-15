package vehicles;

public abstract class CVehicle {
	�oordinates coordinates;
	double price;
	double speed;
	double year;	

	public CVehicle(�oordinates coordinates, double price, double speed, double year) {
		super();
		this.coordinates = coordinates;
		this.price = price;
		this.speed = speed;
		this.year = year;
	}

	public �oordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(�oordinates coordinates) {
		this.coordinates = coordinates;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CVehicle [coordinates=" + coordinates + ", price=" + price + "uah, speed=" + speed + "km/h, year=" + year
				+ "]";
	}
	
	
	
}
