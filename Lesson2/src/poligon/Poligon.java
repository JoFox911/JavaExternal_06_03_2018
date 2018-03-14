package poligon;

import java.util.ArrayList;


public class Poligon {
	ArrayList<Point> points;

	public Poligon(Point p) {
		super();
		this.points = new ArrayList<Point>();
		this.points.add(p);
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void addPoint(Point point) {
		this.points.add(point);
	}

	@Override
	public String toString() {
		return "Poligon [points=" + points + "]";
	}
		
	
}
