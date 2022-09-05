package chap8;

class Bingo {
	int x= 12;
	public void method(int x) {
		x += x;
		System.out.println(x);
	}
}
public class A {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.method(10);
	}

}
