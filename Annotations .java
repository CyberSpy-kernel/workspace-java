class Animal {
	void bark() {
		System.out.println("Animal barking!");
	}
}
class Dog extends Animal {
	@Override
	void bark() {
		System.out.println("Dog barking!");
	}
}
public class Annotations {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
	}
}

//@Native
//@Repeatable
//@Inherited
//@Documented
//@Retention
//@Target
//@SuppressWarnings
//@SafeVarargs
//@FunctionalInterface
//@SuppressWarnings
//@Deprecated
//@Override
