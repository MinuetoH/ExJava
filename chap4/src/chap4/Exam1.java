package chap4;

import java.util.Scanner;

/*
 * 1. 양수, 음수, 영을 출력
 * 2. 짝수, 홀수 여부 출력
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = scan.nextInt();
		// 1. 양수, 음수, 영을 출력
		if(num>0)
			System.out.println("양수입니다.");
		else if(num<0)
			System.out.println("음수입니다.");
		else
			System.out.println("영입니다.");
		
		// 2. 짝수, 홀수 여부 출력
		if(num%2==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}
