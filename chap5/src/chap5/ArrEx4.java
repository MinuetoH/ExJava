package chap5;

import java.util.Scanner;

/*
 * 10진수를 2진수로 변경하기
 */
public class ArrEx4 {

	public static void main(String[] args) {
		int [] octal = new int[10];		// 000000...000
		System.out.println("10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		// 10
		int divnum = num, index = 0;	// 현재의 값이 저장된 배열의 인덱스 저장
		while(divnum != 0) {	// 10
			octal[index++] = divnum %2;	//[0] = 0
			divnum /=2;		// 10/2 = 5 
		}
		System.out.println(index);
		System.out.print(num+"의 2진수:");
		for(int i=index-1;i>=0;i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
	}

}
