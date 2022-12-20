package human15;

public class StringLengthExam {

	public static void main(String[] args) {
		String ssn = "7600001000000";
		
		int len = ssn.length();
		System.out.println(len);
		
		if(len == 13) {
			System.out.println("주민번호 자리수는 맞습니다.");
		}
		else {
			System.out.println("주민번호 자리수는 맞지 않으므로 다시 확인해주세요.");
		}
	}
}
