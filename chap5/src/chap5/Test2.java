package chap5;

/*
 * [결과]
2단	3단	4단	5단	
2*2=4	3*2=6	4*2=8	5*2=10	
2*3=6	3*3=9	4*3=12	5*3=15	
2*4=8	3*4=12	4*4=16	5*4=20	
2*5=10	3*5=15	4*5=20	5*5=25	
2*6=12	3*6=18	4*6=24	5*6=30	
2*7=14	3*7=21	4*7=28	5*7=35	
2*8=16	3*8=24	4*8=32	5*8=40	
2*9=18	3*9=27	4*9=36	5*9=45	
6단	7단	8단	9단	
6*2=12	7*2=14	8*2=16	9*2=18	
6*3=18	7*3=21	8*3=24	9*3=27	
6*4=24	7*4=28	8*4=32	9*4=36	
6*5=30	7*5=35	8*5=40	9*5=45	
6*6=36	7*6=42	8*6=48	9*6=54	
6*7=42	7*7=49	8*7=56	9*7=63	
6*8=48	7*8=56	8*8=64	9*8=72	
6*9=54	7*9=63	8*9=72	9*9=81	
 */
public class Test2 {
	public static void main(String[] args) {
		for (int k = 2; k <= 9; k += 4) {
			for (int i = 0; i < 4; i++) {
				System.out.print((k + i) + "단\t");
			}
			System.out.println();
			for (int j = 2; j <= 9; j++) { //항
				for (int i = k; i < k + 4; i++) {
				     System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}				
				System.out.println();
			}
			System.out.println();
		}
		
//		for(int i=2;i<=5;i++) {
//			System.out.print(i+"단\t");
//		}
//		System.out.println();
//		for(int j=2;j<=9;j++) {
//			for(int i=2;i<=5;i++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//				
//			}
//			System.out.println();
//		}
//		
//		for(int i=6;i<=9;i++) {
//			System.out.print(i+"단\t");
//		}
//		System.out.println();
//		for(int j=2;j<=9;j++) {
//			for(int i=6;i<=9;i++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//				
//			}
//			System.out.println();
//		}
	}
}