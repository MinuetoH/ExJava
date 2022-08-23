package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 
 * 1. 양수인 경우 "양수",
 * 	  음수인 경우 "음수".
 * 	  0 인 경우  "영" 출력하기
 * 2. 짝수인지 홀수인지 출력하기
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num+":"+((num>0)?"양수":(num<0)?"음수":"영")+"이고, " + ((num%2==0)?"짝수입니다.":"홀수입니다."));
		
		//-9%2==-1
		System.out.println(num+":"+((num>0)?"양수":(num<0)?"음수":"영")+"이고, " + ((num%2==1 || num%2==-1)?"홀수입니다.":"짝수입니다."));

	}

}
