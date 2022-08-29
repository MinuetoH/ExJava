package chap5;
/*
 * 1. 정수형 배열 10개를 생성
 * 2. 각각의 요소에 1 ~ 100사이의 임의의 수(난수)를 저장.
 * 3. 배열의 요소들의 합을 출력하기
 */
public class ArrEx3 {

	public static void main(String[] args) {
		// 배열의 초기화
		// int [] arr = new int[5];
		int [] arr = {10,20,30,40,50};	// 배열선언, 생성, 요소초기화
										// arr.length = 5. arr[0] ~ arr[4]
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
//		int [] arr2 = {100,200,300};	// 배열선언, 생성, 요소초기화
		int [] arr2;		// 배열 선언
		arr2 = new int[3];		// 배열 생성
		arr[0] = 100;		// 배열 요소의 초기화
		arr[1] = 200;
		arr[2] = 300;
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("arr2=arr ==================");
		arr2 = arr;		// 기존의 arr2[] 객체가 없어짐. 
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("arr2[0]=1000 ==================");
		arr2[0] = 1000;	// 기존의 arr2[] 객체가 없어진걸 확인
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
	}

}
