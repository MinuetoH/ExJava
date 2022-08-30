package chap5;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16
16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10
*/

public class Test8 {
	public static void main(String[] args) {
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String nums = "0123456789ABCDEF";
		char[] numarr = nums.toCharArray();
		
		int[] birnary = new int[10];
		int[] octal = new int[10];
		char[] hexa = new char[10];
		
		//2진수
		int divnum = num;
		int index = 0;
		while(divnum != 0) {
			birnary[index++] = divnum%2;
			divnum /= 2;
		}
		System.out.print(num+"의 2진수: ");
		for(int i=index-1;i>=0;i--)
			System.out.print(birnary[i]);
		System.out.println();
		
		//8진수
		divnum = num;
		index = 0;
		while(divnum != 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print(num+"의 8진수: ");
		for(int i=index-1;i>=0;i--)
			System.out.print(octal[i]);
		System.out.println();
		
		//10진수
		System.out.println(num+"의 10진수: "+num);
		
		//16진수
		
		divnum = num;
		index = 0;
		while(divnum != 0) {
			hexa[index++] = numarr[divnum % 16];
			divnum /= 16;
		}
		System.out.print(num+"의 16진수: ");
		for(int i=index-1;i>=0;i--)
			System.out.print(hexa[i]);
	}
}