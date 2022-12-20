package human26;

public class Student {
	String StudentId;		// 학번
	String Studentname;		//학생 이름
	String StudentMajor;	//전공
	
	String[] courseName;	// 수강신청 과목명
	int[] courseScore;		// 수강신청 점수 ==> 처음에는 0이었다가 점수 확정 후 업데이트
	
	public Student(String StudentId, String Studentname, String StudentMajor, String[] courseName) {
		this.StudentId = StudentId;
		this.Studentname = Studentname;
		this.StudentMajor = StudentMajor;
		this.courseName = courseName;
		this.courseScore = courseScore;
	}
	public void setCourseScore(int[] courseScore) {
		this.courseScore = courseScore;
	}
	public void showInfo() {
		int sum=0;
		System.out.printf("%s 학생의 점수\n", this.Studentname);
		for(int a=0; a<5; a++) {
			System.out.printf("%s : %d \n", courseName[a], courseScore[a]);
//		sum = sum + this.courseScore[a];
		}
//		System.out.printf("총점 : %d \n", sum);
//		System.out.printf("평균 : %d \n", sum/courseName.length);

	}

}
