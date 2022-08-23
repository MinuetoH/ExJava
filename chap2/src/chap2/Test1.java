package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   //정상
//	    char       b="a";   //오류. char <- String 저장 
	    String     c="a";   //정상
//	    String     d='a';   //오류  String <- char 저장
//	    char       e='ab';  //오류. char는 한개문자만 저장가능
	    String     f="ab"; //정상 
//	    char       g = ''; //오류.char는 한개문자만 저장가능.없어도안됨
	    String     h = ""; //정상. 빈문자열 가능. 

//	    byte   var1 = 128; //오류 -128 ~ 127까지 저장가능.범위밖 
//	    short   var1 = 128; //var1 변수의 자료형을 저장 가능한 자료형으로 변경 
	    short   var1 = (byte)128; //형변환 
		short  var2 = 128;  //정상 
//		int    var3 = 28L;  // int <- long. 형변환 연산자 필수
		int    var3 = (int)28L;  // int <- long. 형변환 연산자 필수
		long   var4 = 128L; //정상
//		float  var5 = 1.2;  //실수형리터널의 기본 자료형 double
		float  var5 = 1.2f;  //실수형리터널의 기본 자료형 double
		double var6 = 1.2;  //정상 
	    float var9 = '1'; //정상. float<-char타입의 코드값이 실수형
	    System.out.println("var1="+var1); //-128
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false    : 예약어 변수 사용 불가
      B. default  : 예약어 변수 사용 불가
      C. _var     : 변수 사용 가능
      D. a-class  : - 문자는 변수 사용 불가
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
    A. s#arp  : #문자는 변수 사용 불가  
    B. static : 예약어 변수 사용 불가 
    C. _class : 가능
    D. class  : 예약어 변수 사용 불가
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
    -128 ~ 127 : 256가지 값 가능
                 0 ~ 255 : 부호때문에 -128 ~ 127까지 범위.       
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F;   //정상 
   B. float f2 = 1.0;  //오류. 1.0 double 형. 형변환,접미사
   C. float f3 = '1';  //정상. float <- char
   D. float f4 = "1";  //오류. float(기본형) <- String(참조형)
   E. float f5 = 1.0d; //오류. 형변환연산자 필요.      
*/