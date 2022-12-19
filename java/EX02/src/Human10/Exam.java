package Human10;

public class Exam {

	public static void main(String[] args) {
		Student s1 = new Student("james", 500);
		Student s2 = new Student("tomas", 10000);
		Student s3 = new Student("edward", 20000);
		
		Bus b1 = new Bus("100번", 0, 0);
		Bus b2 = new Bus("200번", 0, 0);
		
		Train t1 = new Train("1호선", 0, 0);
		Train t2 = new Train("2호선", 0, 0);
		
		Taxi x1 = new Taxi("1호기", 0);
		Taxi x2 = new Taxi("2호기", 0);
		Taxi x3 = new Taxi("3호기", 0);

		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n", b1.busNo, b1.passengerCnt,b1.income);
		System.out.println("-----------------------------------------");

		s1.takeBus(b1);
		// 첫번째 학생이 첫번째 버스를 탄다.
		// 첫번째 학생 : 나의 돈이 1000 빠져 나감.
					// 나의 돈이 1000보다 적으면 못탐.
		// 첫번째 버스 : 승객이 +1, 수입이 1000 늘어남.
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n", b1.busNo, b1.passengerCnt,b1.income);

		System.out.println("-----------------------------------------");
		
		s2.takeTrain(t2);
		// 두번째 학생이 두번째 버스를 탄다.
		// 두번째 학생 : 나의 돈이 1200 빠져 나감.
		// 두번째 버스 : 승객이 +1, 수입이 1200 늘어남.
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n", b1.busNo, b1.passengerCnt,b1.income);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n", b2.busNo, b2.passengerCnt,b2.income);
		System.out.printf("%s지하철은 승객이 %d명이고, 수입이 %d 입니다.\n", t1.trainNo, t1.passengerCnt,t1.income);
		System.out.printf("%s지하철은 승객이 %d명이고, 수입이 %d 입니다.\n", t2.trainNo, t2.passengerCnt,t2.income);
		
		s3.takeTaxi(x3);
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
		
		x3.showInfo();
		
	
		
		
	}

}
