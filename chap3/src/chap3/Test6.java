package chap3;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();	// 반지름
		double L = 2*pi*r;
		double A = (L/2)*r;
		System.out.println("반지름 "+r+"의 원주는 "+L+"이고, 면적은 "+A);
		System.out.printf("둘레 : %.2f, 면적 : %.2f",L,A);
	}
}