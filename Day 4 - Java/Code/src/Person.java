
public class Person implements Cloneable {

	private String name;
	private int age;

	public Person() {
		this("Anonymous", -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person that) { // Enhanced instanceof
			if (this.name == that.name && this.age == that.age) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Polo", 21);
		Person p2 = new Person("Polo", 21);
//		Person p2 = p1;
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.hashCode());
		Person pc = (Person) p2.clone();
		System.out.println(p1);
		System.out.println(pc);

	}

}
