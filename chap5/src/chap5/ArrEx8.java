package chap5;
/*
 * 다차원 배열 : 배열의 배열로 표시함.
 * 	
 * 2차원 배열 : 1차원 배열의 참조변수의 배열.
 * 			 1차원 배열의 배열.
 * 
 * 
 */
public class ArrEx8 {
	
		public static void main(String[] args) {
			//2차원배열 초기화
			//arr[0] : {10,20}	arr[0][0],arr[0][1] 
			//arr[1] : {30,40}	arr[1][0],arr[1][1] 
			//arr[2] : {50,60}	arr[2][0],arr[2][1] 
			
			int[][] arr = {{10,20},{30,40},{50,60}};
			
			for(int i=0;i<arr.length;i++) {	
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("arr["+i+"]["+j+"]="+ arr[i][j]);
				}
			}
			System.out.println("개선된 for문으로 출력:첨자 사용 불가. ");
			//개선된 for문
			for(int[] ar1:arr) {	//ar1 : {10,20}
				for(int a:ar1) {	//a	  : 20
					System.out.println(a);	// 20
				}
			}
		}
		
}
