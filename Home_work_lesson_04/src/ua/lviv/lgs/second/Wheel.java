package ua.lviv.lgs.second;

public class Wheel {
	
	private int size;
	private String typeWheel;

	
	public Wheel(int size, String typeWheel) {
		super();
		this.size = size;
		this.typeWheel = typeWheel;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String getTypeWheel() {
		return typeWheel;
	}
	
	public void setTypeWheel(String typeWheel) {
		this.typeWheel = typeWheel;
	}
	
	@Override
	public String toString() {
		return "wheel [size=" + size + ", typeWheel=" + typeWheel + "]";
	}
	
	public void changeSize(int anotherSize) {
		this.size = anotherSize;
	}
}
