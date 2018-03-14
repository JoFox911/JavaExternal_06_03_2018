package poligon;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(3,4,0,0);
		Point p2 = new Point(3,1,5,9);
		Point p3 = new Point(8,9,48,3);
		Poligon myPoligon = new Poligon(p1);
		myPoligon.addPoint(p2);
		myPoligon.addPoint(p3);
		System.out.println(myPoligon.toString());
	}

}
