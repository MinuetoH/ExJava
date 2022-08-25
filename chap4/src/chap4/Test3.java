package chap4;

import java.util.Scanner;

/*
   화면에서 한개의 문자를 입력받아  대문자인 경우는 소문자로, 
   소문자인 경우는 대문자로  숫자인 경우는 20을 더한 값을   출력하기
   그외의 문자는 기타 문자 를 출력하세요
   
   [결과]
 한개의 문자를 입력하세요
 A
 a   
   [결과]
 한개의 문자를 입력하세요
 a
 A   
   [결과]
한개의 문자를 입력하세요
1
21
*/
public class Test3 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		//scan.next().charAt(0) : 화면에서 문자열 입력받아 첫번째 문자 한 개
		char ch = scan.next().charAt(0);	
		if(ch >= 'A' && ch <= 'Z') { //대문자
			 System.out.println((char)(ch+32));	//소문자 <= 대문자+32
		} else if (ch >= 'a' && ch <= 'z') { //소문자
			 System.out.println((char)(ch-32));	//대문자 <= 소문자-32
		} else if (ch >= '0' && ch <= '9') { //숫자
			 System.out.println((ch-'0') + 20);
		} else {
			System.out.println("기타문자 입니다.");
		}
//		System.out.println('0'+1);	// 49
//		System.out.println('1'+0);	// 49
		// '1' : 49
	}
}