package cp01_class.bean.animal;

public class AnimalApp {

	public static void main(String[] args) {

		// ===== Inheritance =====
		// Animal <- Cat, Eagle
		
		Animal a = new Animal("Dog", "콩이", 1, "F");
		a.printInfo();
		System.out.println();

		Cat c = new Cat("나비", 5, "F", 3);
		c.printInfo();
		c.sleep();
		System.out.println();

		Eagle e = new Eagle("그리", 4, "M", 2);
		e.printInfo();
		e.fly();

	}

}
