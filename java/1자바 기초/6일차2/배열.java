package human07;

public class HumanExam02 {

	public static void main(String[] args) {
		int [] score = {100,90,80,70,60,50,40,30,20,10,100,90,80,70,60,50,40,30,20,
				10,9,8,7,4,5,6,4,8,1,3};
		int total = 0;
		
		System.out.println("score = " + score);
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[19] = " + score[19]);
		
		System.out.println("전체길이 : " + score.length);
		
		for(int i=0; i<score.length; i++) {		// score.length은 배열의 길이를 의미함.
			total = total + score[i];
		}
		System.out.printf("total = %d\n",total);
		
		score[0] = 20;
		System.out.println("score[0] = " + score[0]);
	}

}
