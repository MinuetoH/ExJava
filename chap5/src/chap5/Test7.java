package chap5;
/*
[결과]
  
길이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****
  
 */

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int len = scan.nextInt(); // 5
		for (int i = 0; i <= len / 2; i++) {
			for (int j = 0; j < len - i; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = len / 2 + 1; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (j >= len - i - 1 && j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}