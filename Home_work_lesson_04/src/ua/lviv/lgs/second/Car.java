package ua.lviv.lgs.second;

public class Car {
	
	private int year;
	private double price;
	private Helm helm;
	private Wheel wheel;
	private Body body;
	
	public Car(int year, double price, Helm helm, Wheel wheel, Body body) {
		super();
		this.year = year;
		this.price = price;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", price=" + price + ", helm=" + helm + ", wheel=" + wheel + ", body=" + body
				+ "]";
	}
	
	public void changePrice(double anotherPrice) {
		this.price = anotherPrice;
	}

}
