package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream : 파일에 데이터 저장.
 * 					  파일이 존재하지 않으면 파일 생성.
 * 					  파일이 존재하면 기존 파일에 등록.
 * 
 * 주요메서드
 * 	void write(int data)
 * 		: data의 1바이트를 출력
 * 	void write(byte[] data)
 * 		: buf의 내용을 출력
 * 	void write(byte[] buf, int start, int len)
 * 		: buf의 start 인덱스부터 len 갯수만큼 내용을 출력
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 출력");
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');	fos.write('2');	fos.write('3');
		fos.write('a');	fos.write('b');	fos.write('c');
		fos.write('가');	fos.write('나');	fos.write('다');
		//String.getBytes() : byte[] <= 문자열
		byte[] buf = "\n반갑습니다. FileOutputStream 예제 소스입니다.".getBytes();
		fos.write(buf);
		fos.write(buf,4,6);
	}
}
