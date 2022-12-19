package human07;

public class HumanExam04 {

	public static void main(String[] args) {
		int max = -9999;		//MAX값을 구할 때는 작은 수를 설정해야함.
		
		int[] array = {1,5,3,8,2};
		for(int a=0;a<array.length;a++) {
			if(max<array[a]) {
			max = array[a];
			}
		}
		System.out.printf("MAX = %d \n", max);
	}

}
