package day03.testJDBC.bean;

public class UserBean {
	private String name;
	private int age;
	private int id;
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + ", id=" + id + ", sex=" + sex + "]";
	}
	
}
