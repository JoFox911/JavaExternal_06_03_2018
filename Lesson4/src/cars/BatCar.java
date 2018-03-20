package cars;

public class BatCar extends Car implements IFly, IMove, ISwim{
	
	public BatCar(String name, double speed, double price, double year) {
		super(name, speed, price, year);
	}
	
	public BatCar(double speed, double price, double year) {
		super("MyBatCar", speed, price, year);
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
	public void fly() {
		System.out.println("I am Amphibian! I can fly");
	}

	@Override
	public String toString() {
		return "BatCar [name=" + name + ", speed=" + speed + ", price=" + price + ", year=" + year + "]";
	}
	
}
