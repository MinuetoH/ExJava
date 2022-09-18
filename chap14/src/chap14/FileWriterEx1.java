package chap14;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileOutputStream : 파일에 데이터 저장.
 * 					  파일이 존재하지 않으면 파일 생성.
 * 					  파일이 존재하면 기존 파일에 등록.
 * 
 * 주요메서드
 * 	void write(int data)
 * 		: data의 2바이트(1char)를 출력
 * 	void write(1char[] data)
 * 		: buf의 내용을 출력
 * 	void write(1char[] buf, int start, int end)
 * 		: buf의 start 인덱스부터 end-1 인덱스까지 내용을 출력
 * 	void write(String str)
 * 		: str의 문자열 내용을 출력
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 출력");
		FileWriter fr = new FileWriter("out2.txt");
		fr.write('1');	fr.write('2');	fr.write('3');
		fr.write('a');	fr.write('b');	fr.write('c');
		fr.write('가');	fr.write('나');	fr.write('다');
		//toCharArray() : char[] <= 문자열
		char[] buf = "\n반갑습니다. FileWriter 예제입니다.".toCharArray();
		fr.write(buf);
		fr.write(buf,4,6);
		fr.write("홍길동");
		fr.flush();
		fr.close();
		
	}
}
