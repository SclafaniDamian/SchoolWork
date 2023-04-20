// Made By Damian Sclafani
package CSCE145AND146;

public class PetDemo {
    
    public void PetDemoMain() {
		
		//create an object or class type Pet
		Pet p1 = new Pet();
		
		System.out.println(p1.toString());
		
		p1.setName("Fluffy");
		p1.setType("dog");
		p1.setWeight(32.3);
		
		System.out.println(p1.getName());
		System.out.println(p1.getType());
		System.out.println(p1.getWeight());
		
		System.out.println(p1.toString());
		
		
		Pet p2 = new Pet("Ruffles", 40, "dog");
		
		System.out.println("Second Pet Object:\n" + p2.toString());
	}
}
