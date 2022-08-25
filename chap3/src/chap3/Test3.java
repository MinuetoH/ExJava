package chap3;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int total = scan.nextInt();
//		System.out.println((total>=90)?"A학점":(total>=80)?"B학점":(total>=70)?"C학점":(total>=60)?"D학점":"F학점");
		
		int score = scan.nextInt();
		String result = (score>=90)?"A":
			            (score>=80)?"B":
			           	(score>=70)?"C":
			           	(score>=60)?"D":"F";
		System.out.println(score + "점 : " + result + "학점");
	}
}