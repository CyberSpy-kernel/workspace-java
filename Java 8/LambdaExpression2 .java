package java8;

interface B {
	void show();
}

public class LambdaExpression2 {
	public static void main(String[] args) {
		B obj;
		obj = new B() {
			public void show() {
				System.out.println("Hello");
			}
		};
		obj.show();
	}
}
