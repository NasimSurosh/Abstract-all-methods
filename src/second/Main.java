package second;

abstract class Shape {
	abstract void shape();
	abstract void normal();
}

class Rectangle extends Shape {

	@Override
	void shape() {

		System.out.println("Rectangle shape. ");

	}

	@Override
	void normal() {
		System.out.println("normal");
		
	}

}

class Circle extends Shape {

	@Override
	void shape() {

		System.out.println("Circle shape. ");

	}

	@Override
	void normal() {
		System.out.println("vbvkv");
		
	}

}

public class Main {

	public static void main(String[] args) {

		Shape shape = new Rectangle();
		shape.shape();
		shape.normal();
		Shape circle = new Circle();
		circle.shape();
		circle.normal();
	}

}
