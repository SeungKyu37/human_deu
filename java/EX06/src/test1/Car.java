package test1;

public class Car {
	public int currentSpeed;
	public int maxSpeed;
	public String company;
	public String model;
	
	public Car(String company, String model,int currentSpeed, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}
	public void start() {
		System.out.println("시동을 겁니다.");
	}
	public void speedUp () {
		currentSpeed = this.currentSpeed + 5;
		System.out.printf("현재 속도는 %d입니다.\n", currentSpeed);
		}
	public void speedDown() {
		currentSpeed = this.currentSpeed - 5;
		System.out.printf("현재 속도는 %d입니다.\n", currentSpeed);
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
}
