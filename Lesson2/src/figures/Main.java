/*
 * создать динамический массив из разных фигур и вывести информацию на экран
 */
package figures;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(3,4,"p1");
		Point p2 = new Point(3,1,"p2");
		Point p3 = new Point(8,9);
		Line l1 = new Line(p1,p2);
		Line l2 = new Line(new Point(7,3), p3,"l2");
		Triangle t1 = new Triangle(p1, p2, p3);
		ArrayList<Figure> arr = new ArrayList<Figure>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(l1);
		arr.add(l2);
		arr.add(t1);		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
		
	}

}
