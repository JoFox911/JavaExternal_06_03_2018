package figures;

public abstract class Figure {
	protected String name;
	
	public Figure() {
		super();
		this.name = "myFigure";
	}

	public Figure(String name) {
		super();
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Figure [name=" + name + "]";
	}
	
}
