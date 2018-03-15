package vehicles;

public class CShip extends CVehicle{
	private double passengers;
	private String port;
	
	public CShip(Ñoordinates coordinates, double price, double speed, double year, double passengers, String port) {
		super(coordinates, price, speed, year);
		this.passengers = passengers;
		this.port = port;
	}

	public double getPassengers() {
		return passengers;
	}

	public void setPassengers(double passengers) {
		this.passengers = passengers;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	@Override
	public String toString() {		
		return "CShip [coordinates=" + coordinates + ", price=" + price + "uah, speed=" + speed + "km/h, year=" + year + "port=" + port + ", passengers=" + passengers + "]";
	}
	
}
