package human27;

public class StudentExam {

	public static void main(String[] args) {
		String[] courseName1 = {"경제", "물류", "수학","컴퓨터", "영어"};
		Student s1 = new Student("K01","김승규","산업공", courseName1);
		s1.setCourseScore("경제", 80);
		s1.setCourseScore("물류", 81);
		s1.setCourseScore("수학", 82);
		s1.setCourseScore("컴퓨터", 83);
		s1.setCourseScore("영어", 84);
		s1.showInfo();
		
		System.out.println("---------------------");
		
		String[] courseName2 = {"컴퓨터", "수학", "영어","네트웤", "그래픽"};
		Student s2 = new Student("K02","임강산","컴퓨터공", courseName2);
		s2.setCourseScore("컴퓨터", 90);
		s2.setCourseScore("수학", 91);
		s2.setCourseScore("영어", 92);
		s2.setCourseScore("네트웤", 93);
		s2.setCourseScore("그래픽", 94);
		s2.showInfo();
	
	}

}
