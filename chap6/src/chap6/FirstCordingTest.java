package chap6;
/*
2부터 50까지의 숫자 중 소수와  갯수를 구하는 프로그램 작성하기
  
[결과]
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,=>소수갯수:15
*/
public class FirstCordingTest {

	public static void main(String[] args) {
		int[] arr = new int[49];
		int data = 2;
		for (int i = 0; i < arr.length; i++)
			arr[i] = data++;

		int check = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j <= arr[i]; j++) {
				if(arr[i]%j==0)
					check++;
			}
			
			if(check == 1) {
				System.out.print(arr[i] + ",");
				check = 0;
				count++;
			}else
				check = 0;
		}
		System.out.println("=>소수갯수:"+count);

	}

}
