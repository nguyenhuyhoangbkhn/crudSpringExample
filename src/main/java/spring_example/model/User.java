package spring_example.model;

public class User {
	private int id;
	private String firtsName;
	private String lastName;
	private String name;
	private String password;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(int id,String firtsName, String lastName, String password, String address) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.password = password;
		this.address = address;
	}
	public User(String firtsName, String lastName, String address) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.address = address;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [firtsName=" + firtsName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
