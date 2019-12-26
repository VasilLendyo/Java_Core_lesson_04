package ua.lviv.lgs.second;

public class Helm {

	private double diameter;
	private String type;

	public Helm(double diameter, String type) {
		super();
		this.diameter = diameter;
		this.type = type;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body [diameter=" + diameter + ", type=" + type + "]";
	}

	public void changeDiameter(double anotherDiameter) {
		this.diameter = anotherDiameter;
	}
}