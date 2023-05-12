package cp01_class.bean.animal;

public class Animal {

	private String type; // 동물
	private String name; // 이름
	private int age; // 나이
	private String sex; // 성별. F(여성), M(남성)

	// Constructor
	public Animal() {

	}

	public Animal(String type, String name, int age, String sex) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// Method
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void printInfo() {
		System.out.println("===== Animal Info =====");
		System.out.print("동물=" + type);
		System.out.print(" | 이름=" + name);
		System.out.print(" | 나이=" + age);
		System.out.println(" | 성별=" + sex);
	}
}
