package test.zhuzhongji.process;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hello {
	/**
	 * @author：zhuzhongji @date： 2016年7月24日 下午8:36:05
	 */
	public static void main(String[] args) {
		Person person = new Person(26, "Juventus");
		person.setWorkDay(7);
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(person);
			os.close();

			Person.name = "Alex";

			FileInputStream in = new FileInputStream("foo.ser");
			ObjectInputStream s = new ObjectInputStream(in);
			Person p = (Person) s.readObject();
			System.out.println("name==" + Person.name + " age==" + p.getAge() + " workDay==" + p.getWorkDay() + " fClub==" + p.getfClub());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
