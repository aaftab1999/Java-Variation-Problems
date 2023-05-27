package Variation;

public class cloneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "aftab", "afta@gmail.com");

		try {
			Person p2 = (Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p1.setId(2);
		System.out.println(p1);

	}

}

class Person implements Cloneable {
	private int id;
	private String name;
	private String email;

	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
