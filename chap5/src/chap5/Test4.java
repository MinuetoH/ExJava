package chap5;

import java.util.Scanner;

/*
 * 1 ~ 100사이의 임의의 값을 시스템이 저장하고, 사용자는 숫자를 입력받아 
 * 저장된 숫자를 맞추는 프로그램 작성하기
[결과]
1과100사이의 값을 입력 : 50
더작은수를 입력하세요
1과100사이의 값을 입력 : 25
더작은수를 입력하세요
1과100사이의 값을 입력 : 10
더큰수를 입력하세요
1과100사이의 값을 입력 : 15
더큰수를 입력하세요
1과100사이의 값을 입력 : 20
더작은수를 입력하세요
1과100사이의 값을 입력 : 18
더작은수를 입력하세요
1과100사이의 값을 입력 : 17
맞췄습니다.
시도 횟수는 7입니다.
 */

public class Test4 {
	public static void main(String[] args) {
		//answer : 1 ~ 100 사이의 임의의 수 저장
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; 
		int count = 0;
		Scanner s = new Scanner(System.in);
		while (true) {  //무조건 반복. 내부에 break 문장이 없으면 무한반복. 
			count++;
			System.out.print("1과100사이의 값을 입력 : ");
			input = s.nextInt();
			if (answer > input)
				System.out.println("더큰수를 입력하세요");
			else if (answer < input)
				System.out.println("더작은수를 입력하세요");
			else { //정답 입력
				System.out.println("맞췄습니다.");
				break; //반복문에서 빠짐. 
			}
		}
		System.out.println("시도 횟수는 " + count + "입니다.");



		
//		int [] arr = new int[1];
//		arr[0] = (int)(Math.random()*100)+1;
//		
//		int num = 0;
//		int count = 0;
//		while(arr[0]!=num) {
//			System.out.print("1과 100사이의 값을 입력 : ");
//			Scanner scan = new Scanner(System.in);
//			num = scan.nextInt();
//			if(arr[0]<num)
//				System.out.println("더 작은 수를 입력하세요.");
//			else if(arr[0]>num)
//				System.out.println("더 큰 수를 입력하세요.");
//			count += 1;
//		}
//		System.out.println("맞췄습니다.");
//		System.out.println("시도 횟수는 "+count+"입니다.");
		

	}
}