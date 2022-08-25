package chap4;
/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이
 * 5
 * 
 1.
  *
  **
  ***
  ****
  *****
  
 2.
  *****
  ****
  ***
  **
  *
 
 3.		 i	j
       * 5	5			=> * : i <= j
      ** 4	4 5
     *** 3	3 4 5
    **** 2	2 3 4 5
   ***** 1	1 2 3 4 5
  
 4. 	i	j
  ***** 1 2 3 4 5		=> * : i <= j
   ****   1 2 3 4
    ***     1 2 3
     **       1 2
      *         1
   
 */

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이:");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		
		System.out.println("1. ");
		for(int i=1;i<=height;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			
			System.out.println();

		}
		
		System.out.println("2. ");
		for(int i=height;i>=1;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			
			System.out.println();

		}
		
		System.out.println("3. ");
		for(int i=height;i>=1;i--) {
			for(int j=1;j<=height;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

		System.out.println("4. ");
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=height;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}

}
