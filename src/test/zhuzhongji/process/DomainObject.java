package test.zhuzhongji.process;

import java.io.Serializable;

public class DomainObject implements Serializable {
	private static final long serialVersionUID = -1753295212322114209L;
	/*private String name;
	private int age;

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
	}*/

	public String toString(){
		return "This is a serializable test!";
	}

	public void doSomeWork(){
		System.out.println("hello");
	}
}
