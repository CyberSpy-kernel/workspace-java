
// Generics 

class Printer<T> {
	T thingToPrint;
	
	public Printer(T thingToPrint) { // Here type T is user defined data type 
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
}

public class A0077 { // IntergerPrinter
	public static void main(String[] args) { 
		Printer<Integer> printer = new Printer<>(23);	// create printer for Integer values
		printer.print(); // calling print method for Integer values
		
		Printer<Double> doublePrinter = new Printer<>(10.3);	// create printer for double values
		doublePrinter.print(); // calling print method for Double values
		
		Printer<String> stringPrinter = new Printer<>("Hello");	// create printer for double values
		stringPrinter.print();	// calling print method for String values
	}
}
