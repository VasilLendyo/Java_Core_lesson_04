package ua.lviv.lgs.third;

public class Application_03 {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Cat", 45.5, 4);
		System.out.println("Animal Name = " + a.getName() + ", Animal Speed = " + a.getSpeed() + ", Animal Age = " + a.getAge());
		
		a.setName("Dog");
		a.setSpeed(56.6);
		a.setAge(6);
		
		System.out.println(a);
	}

}
