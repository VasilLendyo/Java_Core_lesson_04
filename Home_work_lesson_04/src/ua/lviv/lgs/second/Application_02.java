package ua.lviv.lgs.second;

public class Application_02 {
	public static void main(String[] args) {
		
		Car c = new Car(1999, 3000, new Helm(56, "Sport"), new Wheel(13, "Low"), new Body("Black", "Sedan"));
		System.out.println(c);
		
		c.changePrice(3200);
		System.out.println(c);
	}

}
