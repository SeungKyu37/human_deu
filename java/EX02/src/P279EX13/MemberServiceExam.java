package P279EX13;

public class MemberServiceExam {

	public static void main(String[] args) {
		MemberService memberService = new MemberService("hong","12345");
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
