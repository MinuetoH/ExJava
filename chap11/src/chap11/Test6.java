package chap11;

import java.text.DecimalFormat;

/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기
 *  
 * [결과]
 *  12,340
 */
public class Test6 {
	public static void main(String[] args) {
//		String str = "1,234";
//		str = str.replace(",", "");
//		int num = Integer.parseInt(str)*10;
//		DecimalFormat De = new DecimalFormat();
//		System.out.println(De.format(num));
		
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",","")); //1234 숫자
		System.out.println(String.format("%,d", num*10));
		System.out.printf("%,d\n", num*10);		
		
	}
}