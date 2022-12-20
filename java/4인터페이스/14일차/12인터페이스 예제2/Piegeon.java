package human12;

public class Piegeon extends Animal implements Flyable{

	public Piegeon(int x, int y, int age) {
		super(x, y, age);
	}
	@Override
	public void printInfo() {
		System.out.printf("Piegeon -> X(%d), Y(%d), age(%d)\n", this.getX(), this.getY(), this.getAge());	}
	@Override
	public void fly() {
		System.out.println("새는 날 수 있습니다.");
	}
	@Override
	public void flyMove(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
	}

}
