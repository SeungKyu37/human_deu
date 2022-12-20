package human07;

public class HumanExam06 {

	public static void main(String[] args) {
		int[][]arr= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length;b++) {
				sum = sum + arr[a][b];
				count++;
			}
			// count = count + array[a].length;
		}
		avg = (double)sum/count;
				System.out.println("sum : " +sum);
				System.out.println("avg : " +avg);
		}

}
