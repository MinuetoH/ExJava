package chap5;

import java.util.Scanner;

/*
 * 10진수를 받아서 8진수로 변경하여 출력하기
 * 
 * 2진수 : birnary	1010
 * 8진수 : octal		12	=> 2진수 3자리
 * 16진수 : hexa		A	=> 2진수 4자리
 */
public class Exam2 {

	public static void main(String[] args) {
		int [] birnary = new int[32];		
		System.out.println("10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		
		int divnum = num;
		int index = 0;	
		while(divnum != 0) {	
			birnary[index++] = divnum %8;	
			divnum /=8;		
		}
		System.out.print(num+"의 8진수:");
		for(int i=index-1;i>=0;i--) {
			System.out.print(birnary[i]);
		}
		System.out.println();
	}

}
