package chap4;
/*
 * 구구단을 가로로 출력
 */

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		/*
		 * 블럭 : {}
		 * 지역변수 : 블럭내부에서 선언된 변수
		 */
		for(int s=2;s<=9;s++) {
			//i 지역변수는 for문 내부에서만 사용 가능
			System.out.print(s+"단\t");
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}	
			System.out.println();
		}	
		
		
	}

}
