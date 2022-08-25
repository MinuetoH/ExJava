package chap4;
/*
 * 반복문 예제
 * 12345 출력하기
 */
public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("1. 반복문 없이 출력");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		System.out.println("2. for 구문으로 출력");		// 정형화되어 있고, 시작과 끝이 명확하게 나타날 때 
		/*
		 * 1. int i=1 : 초기값 실행
		 * 2. i<=5 : 조건문. i=1 => T
		 * 3. System.out.print(1);
		 * 4. i++ => i=2
		 * 5. i<=5 : 조건문. i=2 => T
		 * 6. System.out.print(2);
		 * 7. i++ => i=3
		 * 8. i<=5 : 조건문. i=3 => T
		 * 9. System.out.print(3);
		 * ...
		 * 	  i++ => i=6
		 * 	  i<=5 : 조건문. i=6 => F
		 * 
		 */
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("3. while 구문으로 출력");	// 언제 끝날지 모를 때, 무한루프가 필요할 때 
		int i = 1;;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("4. do while 구문으로 출력");
		i=1;
		do {
			System.out.print(i);
			i++;
		} while(i<=5);
		System.out.println();


	}

}
