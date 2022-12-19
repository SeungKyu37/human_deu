package Human08;

public class StudentExam {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		int tot = s.getTotal();
		double avg = s.getAvg();
		System.out.printf("이름: %s\n", s.name);
		System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %4.1f\n", avg);
		
		System.out.println("------------------------------------");
		
		Student s2 = new Student("길동홍", 2, 2, 100, 100, 100);
		
		tot = s2.getTotal();
		avg = s2.getAvg();
		System.out.printf("이름: %s\n", s2.name);
		System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %4.1f\n", avg);
		
		System.out.println("------------------------------------");
		
		Student s3 = new Student("동홍길", 3, 3, 95, 80, 75);
		
		tot = s3.getTotal();
		avg = s3.getAvg();
		System.out.printf("이름: %s\n", s3.name);
		System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %4.1f\n", avg);
	}
	

}
