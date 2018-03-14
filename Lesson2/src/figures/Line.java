package figures;

public class Line extends Figure {
	private Point begin;
	private Point end;
	
	public Line(Point begin, Point end, String name) {
		super(name);
		this.begin = begin;
		this.end = end;
	}
	
	public Line(Point begin, Point end) {
		super("myLine");
		this.begin = begin;
		this.end = end;
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Line " + name + " [begin=" + begin + ", end=" + end + "]";
	}
		
}
