package human06;

public class Taxi extends Car{
	public Taxi() {
		super();
		System.out.println("Taxi 객체 생성");
	}
	public int getCharge() {
		int charge = 8000;	
		System.out.printf("택시 요금 : %d\n", charge);
		return charge;
		}
}
