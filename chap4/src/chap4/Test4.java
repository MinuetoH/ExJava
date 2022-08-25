package chap4;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
   
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //입력받은수
		int tmp = num;  
		int result = 0; //뒤집은 수
		while(tmp != 0) {
			result *=10;	
			result += tmp %10;
			tmp /= 10;
		}
		// num : 입력받은 수
		// result : 뒤집은 숫자
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
	}
}