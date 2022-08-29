package chap5;

import java.util.Scanner;

/*
 * 10진수를 16진수로 변경하기
 * 					   10 11 12 13 14 15
 * 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F
 */
public class ArrEx5 {
	public static void main(String[] args) {
		String nums = "0123456789ABCDEF";
		// toCharArray() : char 배열 <- 문자열
		// numarr = {'0','1','2','3','4',...'E','F'}
		char[] numarr = nums.toCharArray();
		char[] hexa = new char[10];
		System.out.println("10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();	//32
		int divnum = num;
		int index = 0;
		while(divnum != 0) {		//32
			// 0=32%16, numarr[0]
			hexa[index++] = numarr[divnum%16];	//0
			divnum /= 16;	//2
		}
		System.out.print(num + "의 16진수:");
		for(int i=index-1;i>=0;i--) {
			System.out.print(hexa[i]);
		}
		System.out.println();
	}

}
