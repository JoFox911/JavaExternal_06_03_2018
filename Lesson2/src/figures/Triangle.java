package figures;

public class Triangle extends Figure{
	private Point vertexA;
	private Point vertexB;
	private Point vertexC;
	private Line edgeAB;
	private Line edgeBC;
	private Line edgeAC;
	
	public Triangle(Point vertexA, Point vertexB, Point vertexC, String name) {
		super(name);
		this.vertexA = vertexA;
		this.vertexB = vertexB;
		this.vertexC = vertexC;
	}
	
	public Triangle(Point vertexA, Point vertexB, Point vertexC) {
		super("myTriangle");
		this.vertexA = vertexA;
		this.vertexB = vertexB;
		this.vertexC = vertexC;
	}

	public Point getVertexA() {
		return vertexA;
	}

	public void setVertexA(Point vertexA) {
		this.vertexA = vertexA;
	}

	public Point getVertexB() {
		return vertexB;
	}

	public void setVertexB(Point vertexB) {
		this.vertexB = vertexB;
	}

	public Point getVertexC() {
		return vertexC;
	}

	public void setVertexC(Point vertexC) {
		this.vertexC = vertexC;
	}

	public Line getEdgeAB() {
		if(edgeAB == null){
			edgeAB = new Line(vertexA,vertexB);
		}
		return edgeAB;
	}

	public Line getEdgeBC() {
		if(edgeAB == null){
			edgeAB = new Line(vertexB,vertexC);
		}
		return edgeBC;
	}
	
	public Line getEdgeAC() {
		if(edgeAB == null){
			edgeAB = new Line(vertexA,vertexC);
		}
		return edgeAC;
	}

	@Override
	public String toString() {
		return "Triangle " + name + " [vertexA=" + vertexA + ", vertexB=" + vertexB + ", vertexC=" + vertexC + "]";
	}
	
}
