package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
	    char       a='a'; 
//	    char       b="a";    // 작은따옴표를 사용해야함.
	    String     c="a";   
//	    String     d='a';	 // 큰따옴표를 사용해야함.
//	    char       e='ab'; 	 //
	    String     f="ab"; 
//	    char       g ='';	 // '' 안에 공백 불가
	    String     h = ""; 

//	    byte   var1 = 128; 	// byte : -128 ~ 127
		short  var2 = 128; 
//		int    var3 = 28L;	// L : long형 리터널 이므로 28L : long임
		long   var4 = 128L;
//		float  var5 = 1.2;  	//	리터널 기본형이 double이므로 float형 리터널을 붙여야함. 
		double var6 = 1.2; 
	    float var9 = '1';   
	    
	    int defalut = 1;
	    
	    System.out.println(var9);
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false	 (X) : 예약어
      B. default (O) : 예약어 아님
      C. _var	 (O) : _ 특수문자 사용가능
      D. a-class (X) : - 사용불가
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
    A. s#arp  
    B. static  
    C. _class (O)
    D. class 
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     -128 ~ 127
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F;	(O)
   B. float f2 = 1.0; 	(O)
   C. float f3 = '1';  
   D. float f4 = "1";  
   E. float f5 = 1.0d;      
*/

