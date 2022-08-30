package chap6;

import java.util.Scanner;

/*
삼각형의 높이를 입력받아, 다음과 같은 역 직각삼각형을 출력하기 
[결과] 
삼각형의 높이를 입력하세요
5
15 14 13 12 11
  10  9  8  7
      6  5  4
         3  2
            1
*/
public class Test1 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[][] arr = new int[num][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[num];
		}
		
		int data = 0;
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=i;j--) {
				arr[i][j] = ++data;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}

	}
}