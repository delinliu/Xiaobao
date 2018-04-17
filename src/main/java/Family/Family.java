package Family;

public class Family {
	Person father = new Person("delin", 28);
	Person mother = new Person("xiaobao", 28);
	Cat pet = new Cat("xiaoguai", 0.5, "tiger");
	
	public void printInformation() {
		father.printInformation();
		mother.printInformation();
		pet.printInformation();
		System.out.println("What a happy family!");
	}
	


}
