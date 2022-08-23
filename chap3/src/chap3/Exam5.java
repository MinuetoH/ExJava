package chap3;

import java.util.Scanner;

/*
 * 화면에서 금액을 입력받아서 500, 100, 50, 10, 1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기, 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원	: 11개
 * 100원	: 1개
 * 50원	: 0개
 * 10원 	: 4개
 * 1원 	: 1개
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		int a = amt/500;					// 500원 갯수
		int b = (amt%500)/100;				// 100원 갯수
		int c = ((amt%500)%100)/50;			// 50원 갯수
		int d = (((amt%500)%100)%50)/10;	// 10원 갯수
		int e = amt%10;						// 1원 갯수
		System.out.println("500원 : "+ a +"개");
		System.out.println("100원 : "+ b +"개");
		System.out.println("50원 : "+ c +"개");
		System.out.println("10원 : "+ d +"개");
		System.out.println("1원 : "+ e +"개");
		System.out.println("===================");
		System.out.println("500원: "+ amt/500+"개");
		System.out.println("100원: "+ (amt%500)/100+"개");
		System.out.println("50원: "+ ((amt%500)%100)/50+"개");
		System.out.println("10원: "+ (((amt%500)%100)%50)/10+"개");
		System.out.println("1원: "+ (amt%10)+"개");
		System.out.println("===================");
		System.out.println("500원: "+ amt/500 +"개");
		amt %= 500;			// 141
		System.out.println("100원: "+ amt/100 +"개");
		amt %= 100;			
		System.out.println("50원: "+ amt/50 +"개");
		amt %= 50;			
		System.out.println("10원: "+ amt/10 +"개");
		amt %= 10;			
		System.out.println("1원: "+ amt +"개");


	}

}
