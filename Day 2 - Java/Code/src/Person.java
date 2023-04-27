
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("Anonymous", 21);
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Jestin", 21);
		Person p2 = new Person();
		p1.print();
		p2.print();
	}
}
