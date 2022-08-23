package chap2;
/*
5. 다음결과가 나오도록 Test2 프로그램 수정하기
[결과]
c=30
ch=C
f=1.5
l=27000000000
result=true 
c=30
ch=C
f=1.0
l=1230196224
result=false
*/
public class Test2 {
	public static void main(String[] args) {
		   byte a = 10;
		   byte b = 20;
		   byte c = (byte)(a + b); // 연산의 결과 int
		   char ch = 'A';
		   ch = (char)(ch + 2); // 연산의 결과 int
		   float f = 3f / 2;    // float <-float=float/int
		   long l= 3000L * 3000 * 3000;
		   float f2 = 0.1f;
		   double d = 0.1;
		   // 0.1 == 0.1f : 같은 값? 
		   boolean result = (float)d==f2; //false
		   System.out.println("c="+c);
		   System.out.println("ch="+ch);
		   System.out.println("f="+f);
		   System.out.println("l="+l);
		   System.out.println("result="+result); //자바버그.
		   //%.30f : 실수형은 소숫점이하 30자리로 출력
		   System.out.printf("%.30f, %.30f\n",f2,d);
		   System.out.println(f2); //0.1
		   System.out.println(d);  //0.1
	}
}