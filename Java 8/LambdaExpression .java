package java8;

interface A {
	void show();
}

class Xyz implements A {
	public void show() {
		System.out.println("Hello");
	}
}

public class LambdaExpression {
	public static void main(String[] args) {
		A obj;
		obj = new Xyz();
		obj.show();
	}
}
