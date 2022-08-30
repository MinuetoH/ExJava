package chap5;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기
[결과] 
금액을 입력하세요
36000
동전이 부족합니다.
[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/
public class Test10 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] coin = {500,100,50,10,5,1};
		int[] count = {5,5,5,5,5,5};
		int total = 0;
		//동전의 최대급액 : 환전가능 금액
		for(int i=0;i<coin.length;i++) {
			total += coin[i]*count[i];
		}
		
		if(num>total) {
			System.out.println("동전이 부족합니다.");
			return;	//main 메서드 종료.
		}
		
		//동전을 바꿔줄 수 있는 경우
		for(int i=0;i<coin.length;i++) {
			if((num/coin[i]>count[i])) {
				System.out.println(coin[i]+"원: "+count[i]);
				num -= coin[i]*count[i];
				count[i] = 0;
			}else{
				System.out.println(coin[i]+"원: "+(num/coin[i]));
				count[i] -= (num/coin[i]);
				num = num%coin[i];
			}
		}
		for(int i=0;i<count.length;i++) {
			System.out.println("남은 동전 "+coin[i]+"원:"+count[i]+"개");
		}
				
		
		
	}
}