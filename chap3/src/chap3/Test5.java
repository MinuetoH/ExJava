package chap3;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int adj = scan.nextInt();	// adjacent : 밑변
		int opp = scan.nextInt();	// opposite : 높이
		int sqr = (adj*opp)/2;		// square	: 넓이
		System.out.println("밑변의 길이");
		System.out.println(adj);
		System.out.println("높이의 길이");
		System.out.println(opp);
		System.out.println("넓이는 = "+adj+"*"+opp+"/ 2");
		System.out.println("정답은 : "+sqr);
	}
}