package Human10;

public class Student {
	public String name;		// 나의 이름.
	public int money;		// 내가 가지고 있는 돈
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus b) {
		if(this.money >= 1000) {
		this.money = this.money - 1000;
		b.take(1000);
		}
		else { 
			System.out.printf("%s 학생의 돈은 %d이므로 사용불가합니다.\n", this.name, this.money);
		}
	}
	public void takeTrain(Train t) {
		if(this.money >= 1200) {
		this.money = this.money - 1200;
		t.take(1200);
		}
		else {
			System.out.printf("%s 학생의 돈은 %d이므로 사용불가합니다.\n", this.name, this.money);		}
	}
	public void takeTaxi(Taxi x) {
		// t라는 것은 지역변수이고, takeTaxi 매서느 내에서만
		// 사용가능한 taxi 쿨래스의 인스턴스 변수이다.
		if(this.money >= 10000) {
		this.money = this.money - 10000;
		x.take(10000);
		}
		else {
			System.out.printf("%s 학생의 돈은 %d이므로 사용불가합니다.\n", this.name, this.money);
		}
	}

}
