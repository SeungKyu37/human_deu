package test1;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("현대", "아반떼", 90, 250);	
		
		car1.start();
		car1.speedUp();
		car1.speedDown();
		car1.turnOff();
	}

}
