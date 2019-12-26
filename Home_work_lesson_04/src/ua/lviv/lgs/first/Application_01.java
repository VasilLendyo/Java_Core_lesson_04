package ua.lviv.lgs.first;

public class Application_01 {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		r.work();
		
		CoffeeRobot cr = new CoffeeRobot();
		cr.work();
		
		RobotDancer rd = new RobotDancer();
		rd.work();
		
		RobotCoocker rc = new RobotCoocker();
		rc.work();
		
		
		Robot[] array = new Robot[4];
		array[0] = new Robot();
		array[1] = new CoffeeRobot();
		array[2] = new RobotDancer();
		array[3] = new RobotCoocker();
		
		for (int i = 0; i < array.length; i++) {
			array[i].work();
		}
		
	}

}
