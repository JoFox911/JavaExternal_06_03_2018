package cars;

public abstract class Car implements Comparable {
	String name;
	double speed;
	double price;
	double year;
	
	public Car(String name, double speed, double price, double year) {
		super();
		this.name = name;
		this.speed = speed;
		this.price = price;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	@Override
	public int compareTo(Object c) {
		int priceCompare = (int)(this.price - ((Car)c).price);
		int speedCompare = (int)(this.speed - ((Car)c).speed);
		if (speedCompare == 0) {
			return priceCompare;
		}
		else return speedCompare;			
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + ", price=" + price + ", year=" + year + "]";
	}	
	
}
