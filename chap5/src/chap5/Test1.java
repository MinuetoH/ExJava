package chap5;

import java.util.Scanner;

/*
 * 강아지와 병아리 개체수의 합과 다리수의 합을 입력받아
 * 강아지,병아리의 각각의 개체수를 출력하는 프로그램 작성하기
 * 
 * [결과]
 * 강아지와 병아리 합
 * 10
 * 강아지와 병아리 다리의 합
 * 30
 * 강아지 5마리, 병아리 5마리
 * 
 * x : 강아지 마리수
 * y : 병아리 마리수
 * 
 * x + y = 전체 개체수
 * 4x+2y = 전체 다리 갯수
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		boolean search = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("강아지와 병아리 합");
		int acnt = scan.nextInt(); //개체수 합
		System.out.println("강아지와 병아리 다리의 합");
		int lcnt = scan.nextInt();  //다리수 합
		for (int x = 0; x <= acnt; x++) {
			for (int y = 0; y <= acnt; y++) {
				if (((x + y) == acnt) && 
					(((4 * x) + (2 * y)) == lcnt)) {
					search = true;
					System.out.println
					("강아지 " + x + "마리, 병아리 " + y + "마리");
				}
			}
		}
		//!false = true
		//if(search) : search==true 같은 의미
		//if(!search) : search==false 같은 의미
		if (!search)
			System.out.println("입력이 틀렸습니다.");
		
//		int [] arr = new int[1];
//		int [] arr2 = new int[1];
//		int dog = 0;
//		int chick = 0;
//		while(true) {
//			arr[0] = (int)(Math.random()*10)+1;
//			arr2[0] = (int)(Math.random()*10)+1;
//			if(arr[0]+arr2[0]==ani && (arr[0]*4)+(arr2[0]*2)==legSum) {
//				dog = arr[0];
//				chick = arr2[0];
//				break;
//			}else {
//				System.out.println("조건이 맞지 않습니다.");
//				break;
//			}
//				
//		}
//		System.out.println("강아지: "+dog+"마리, "+"병아리: "+chick+"마리");

	}
}