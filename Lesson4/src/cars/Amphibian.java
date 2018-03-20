package cars;

public class Amphibian extends Car implements IMove, ISwim {

	public Amphibian(String name, double speed, double price, double year) {
		super(name, speed, price, year);
	}
	
	public Amphibian(double speed, double price, double year) {
		super("MyAmphibian", speed, price, year);
	}

	@Override
	public void swin() {
		System.out.println("I am Amphibian! I can swim");		
	}

	@Override
	public void move() {
		System.out.println("I am Amphibian! I can move");
	}

	@Override
	public String toString() {
		return "Amphibian [name=" + name + ", speed=" + speed + ", price=" + price + ", year=" + year + "]";
	}	

}
