package figures;

public class Point extends Figure{
	private int x1;
	private int y1;
	
	public Point(int x1, int y1) {
		super("myPoit");
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public Point(int x1, int y1,String name) {
		super(name);
		this.x1 = x1;
		this.y1 = y1;
	}

	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	@Override
	public String toString() {
		return "Point " + name + " [x1=" + x1 + ", y1=" + y1 + "]";
	}

	
	
}
