package chap8;

//인터페이스가 리턴타입으로 사용
class LaxerZet implements Printerable {

	@Override
	public void print() {
		System.out.println("레이저 printer로 출력");
	}
	
}
class InkZet implements Printerable {
	
	@Override
	public void print() {
		System.out.println("잉크젯 printer로 출력");
	}
}
class PrinterManager {
	public static Printerable gerPrinter(String type) {
		if(type.equals("INK"))
			return new InkZet();
		else
			return new LaxerZet();
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		Printerable a = PrinterManager.gerPrinter("INK");
		a.print();
		a = PrinterManager.gerPrinter("LAZER");
		a.print();
	}

}
