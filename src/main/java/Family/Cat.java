package Family;

public class Cat {
	String name;
	double age;
	String color;
	static String description = "mao";

	public Cat(String name, double age, String color) {
		this.name = name;
		this.age = age;
		this.color=color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getAge() {
		return age;
	}

	public static String getDescription() {
		return description;
	}

	public void printInformation() {
		if (age > 1) {
			System.out.println(name + " is " + age + " years old");
		} else {
			System.out.println(name + " is " + age + " year old");
		}
		System.out.println(name + " is " + color + " cat");
		System.out.println(name + " is " + description);
	}
}
