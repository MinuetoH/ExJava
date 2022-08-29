package chap5;


/*
 * arr 배열을 행의 합, 열의 합, 전체 합 출력하기
 * 
 */
public class Exam4 {

	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}};
		/*
		 * 0행 : 10+20 = 30
		 * 1행 : 30+40 = 70
		 * 2행 : 50+60 = 110
		 * 0열 : 10+30+50 = 90
		 * 1열 : 20+40+60 = 120
		 * 전체합 : 210
		 */
		int [] colsum = new int[2];
		int totsum = 0;
		
		for(int i=0;i<arr.length;i++) {	
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				colsum[j] += arr[i][j];
				totsum += arr[i][j];
									
			}
			System.out.println(i+"행의 합:"+sum);
			
		}
		for(int i=0; i<colsum.length;i++) {
			System.out.println(i+"열의 합:"+colsum[i]);
		}
		System.out.println("전체 합:"+totsum);


	}

}
