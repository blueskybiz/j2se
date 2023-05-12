package cp01_class.bean.animal;

public class Cat extends Animal {

	private int leg; // 다리 수

	// Constructor
	public Cat() {

	}

	public Cat(String name, int age, String sex, int leg) {
		super("Cat", name, age, sex);
		this.leg = leg;
	}

	// Method
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void sleep() {
		System.out.println(getName() + " :: sleep()");
	}

	public void printInfo() {
		System.out.println("===== Cat Info =====");
		System.out.print("동물=" + getType());
		System.out.print(" | 이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 성별=" + getSex());
		System.out.println(" | 다리=" + leg + "(개)");
	}

}
