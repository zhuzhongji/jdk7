package test.zhuzhongji.process.comparable;

public class Person/* implements Comparable<Person>*/{
	/**
	 * @author：zhuzhongji @date： 2016年7月24日 下午9:13:45
	 */
	private final int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	
	public String toString(){
		return "Id: " + id + "\tName: " + name + "\tAge: " + age;
	}

	/*@Override
	public int compareTo(Person o) {
		
		return this.id - o.id;
	}*/

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Person) {
			if(this.age == ((Person)obj).age) {
				flag = true;
			}
		}
		return flag;
	}
}
