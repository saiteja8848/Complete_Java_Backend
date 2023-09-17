package Java_8;

@FunctionalInterface
interface Printer {
	void print();
}

class XeroxPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("Xerox Printer");
	}

}

public class LambdaAndFI {

	static void printCopy(Printer printer) {
		printer.print();
	}

	public static void main(String[] args) {
		Printer printer = new XeroxPrinter();
		printCopy(printer);
		
		//proving definition to functional interface
		printer = ()-> System.out.println("Color Printer");
		printCopy(printer);
		
		//3rd way of doing it
		printCopy(()->System.out.println("BlackColor Printer"));
	}
}
