package cp01_class.bean.animal;

public class Eagle extends Animal {

	private int wing; // 날개 수

	// Constructor
	public Eagle(String name, int age, String sex, int wing) {
		super("Eagle", name, age, sex);
		this.wing = wing;
	}

	// Method
	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	public void fly() {
		System.out.println(getName() + " :: fly()");
	}

	public void printInfo() {
		System.out.println("===== Eagle Info =====");
		System.out.print("동물=" + getType());
		System.out.print(" | 이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 성별=" + getSex());
		System.out.println(" | 날개=" + wing + "(개)");
	}

}
