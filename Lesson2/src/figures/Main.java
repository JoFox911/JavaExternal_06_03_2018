package figures;

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(3,4,0,0,"p1");
		Point p2 = new Point(3,1,5,9,"p2");
		Point p3 = new Point(8,9,48,3);
		Line l1 = new Line(p1,p2);
		Line l2 = new Line(new Point(7,0,4,23), p3,"l2");
		Triangle t1 = new Triangle(p1, p2, p3);
		Figure[] arr = new Figure[6];
		arr[0] = (Figure)p1;
		arr[1] = (Figure)p2;
		arr[2] = (Figure)p3;
		arr[3] = (Figure)l1;
		arr[4] = (Figure)l2;
		arr[5] = (Figure)t1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
	}

}
