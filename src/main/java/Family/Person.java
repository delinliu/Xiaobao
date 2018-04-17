package Family;

public class Person {
	String name;
	int age;
	static String description = "renlei";

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
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
		System.out.println(name + " is " + description);
	}
}
