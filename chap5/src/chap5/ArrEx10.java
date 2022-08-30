package chap5;
/*
  46
  47  37
  48  38  29
  49  39  30  22
  50  40  31  23  16
  51  41  32  24  17  11
  52  42  33  25  18  12   7
  53  43  34  26  19  13   8   4
  54  44  35  27  20  14   9   5   2
  55  45  36  28  21  15  10   6   3   1
 */
public class ArrEx10 {
	
		public static void main(String[] args) {
			int[][] arr = new int[10][];	// 가변배열
			for(int i=0;i<arr.length;i++) {
				arr[i] = new int[i+1];		// 배열생성
			}
			//숫자 채우기
			int data = 0;
			for(int j=arr.length-1;j>=0;j--) {	//열의 값 반복
				for(int i=j;i<arr.length;i++) {	//행의 값 반복
					arr[i][j] = ++data;
				}
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					//printf : 출력 시 서식문자 사용 가능
					// %4d : 4자리로 10진수출력. 
					// %4c : 4자리로 문자를 출력.
					// %4s : 4자리로 문자열 출력.
					System.out.printf("%4d",arr[i][j]);
				} 
				System.out.println();
			}
			
		}
		
}
