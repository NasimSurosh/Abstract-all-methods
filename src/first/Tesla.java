package first;

abstract class Machine {
	/*
	 * 1. an Abstract method will declared with abstract keyword. 2. Abstract
	 * classes cannot be instantiated (you cannot create an instance of abstract
	 * class) 3. it can have abstract and non abstract classes method. 4. it can
	 * have static method and constructor method as will 5. it can have final method
	 * which will force the subclass not to change the body of the method.
	 */
	// abstract void greet(); // there is no method body in abstract methods.
	
	abstract void on();
	

}
public class Tesla extends Machine {

	@Override
	void on() {
	System.out.println("Turn the machine on....");
		
	}
	public static void main(String args[] ) {
		
		Machine machine = new Tesla();
		
		machine.on();
	}
}


