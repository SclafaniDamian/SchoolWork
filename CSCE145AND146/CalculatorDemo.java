// Made By Damian Sclafani
package CSCE145AND146;

public class CalculatorDemo {

    public void CalculatorDemoMain() {
		
		Calculator c = new Calculator();
		
		//c.calculate();
		
		System.out.println(c.conversion("7.2") + 2);
		
		System.out.println(c.cal("5") - 1);
		
		System.out.println("Round of a number: " + Math.round(7.6));
		
		System.out.println("Minimum value: " + Math.min(2.7, 9.3));
		
		System.out.println("Maximum value: " + Math.max(2.7, 9.3));
		
		System.out.println("Floor of a number: " + Math.floor(8.6));
		
		System.out.println("Ceiling of a number: " + Math.ceil(8.3));
	}
}
