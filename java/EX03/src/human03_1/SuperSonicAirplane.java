package human03_1;

public class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	//아래의 생성자는 생략 가능
	public SuperSonicAirplane() {
		super();
	}
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
		System.out.println("초음속 비행합니다.");
		}
	else {
		// 부모가 가지고 있는 일반 비행을 처리하고 싶음.
		super.fly();
		}
	}
}
