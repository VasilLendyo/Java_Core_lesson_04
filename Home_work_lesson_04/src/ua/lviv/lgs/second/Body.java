package ua.lviv.lgs.second;

public class Body {
	
	private String color;
	private String typeBody;
	
	
	
	public Body(String color, String typeBody) {
		super();
		this.color = color;
		this.typeBody = typeBody;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTypeBody() {
		return typeBody;
	}
	
	public void setTypeBody(String typeBody) {
		this.typeBody = typeBody;
	}
	
	@Override
	public String toString() {
		return "Body [color=" + color + ", typeBody=" + typeBody + "]";
	}
	
	public void changeColor(String anotherColor) {
		this.color = anotherColor;
	}
}

