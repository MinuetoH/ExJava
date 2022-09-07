package chap9;
/*
 * 다중 catch 구문
 * 	- 한 개의 try 블럭에 여러 개의 catch 블럭이 존재
 * 	- try 블럭내에 발생가능한 예외가 여러 개 있는 경우, 예외별로 다른 예외처리 가능.
 * 	- 상위 예외클래스는 catch 구문의 하단에 배치해야 한다.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
//		System.out.println(args[0]);	//try 구문 밖에서 발생된 예외는 catch 구문을 실행하지 못함.
		try {
			System.out.println(args[0]);	//ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(10/1);		//ArithmeticException 예외 발생
			String s = null;				//객체 생성 안함.
			System.out.println(s.trim());	//NullPointerException 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 값을 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		} catch (Exception e) {				//그외 모든 예외 처리
			System.out.println("전산부로 연락하세요");
			e.printStackTrace();
		}
	}
}
