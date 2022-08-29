package chap5;
/*
int[][] score = {
			{90,80,70},
			{95,85,75},
			{70,80,75},
			{75,70,85},
			{70,75,80}
	}; 
* score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
* score 배열의 내용을 result에 저장하고,
* 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
[결과]
1번:	90	80	70	240	
2번:	95	85	75	255	
3번:	70	80	75	225	
4번:	75	70	85	230	
5번:	70	75	80	225	
합계	400	390	385	1175	
*/
public class Test11 {
	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
		int[][] arr = new int[6][4];
		int[] colsum = new int[4];
		int total = 0;
		
		for(int i=0;i<score.length;i++) {
			int sum = 0;
			for(int j=0;j<score[i].length;j++) {
				arr[i][j] = score[i][j];
				sum += score[i][j];
				colsum[j] += score[i][j];
				total += score[i][j];
			}
			arr[i][score[i].length] = sum;
		}
		for(int i=0;i<colsum.length;i++) {
			arr[score.length][i] = colsum[i];
		}
		
		arr[arr.length-1][colsum.length-1] = total;
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print((i+1)+"번:\t");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();

		}
		System.out.print("합계\t");
		for(int i=0;i<colsum.length;i++) {
			System.out.print(arr[arr.length-1][i]+" ");
		}
	}
}