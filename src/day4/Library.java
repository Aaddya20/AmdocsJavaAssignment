package day4;

public class Library {

	private String name;
	private String address;
	private int id;
	private int age;
	
	public Library(String name, String address, int id, int age) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", id=" + id + ", age=" + age + "]";
	}
	
}
