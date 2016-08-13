package test.zhuzhongji.process.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestComparable {
	/**
	 * @author：zhuzhongji
	 * @date： 2016年7月24日 下午9:51:10
	 */
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>(/*new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		}*/);
		ts.add(new Person(1003," 张三 ",15));  
        /**在new 第二个对象的时候已经开始排序了，回调用Person类的compareTo(Object o)方法*/  
        ts.add(new Person(1008," 李四 ",25));  
        ts.add(new Person(1015," 王五 ",73));  
        ts.add(new Person(1001," 赵六 ",49));  
        Iterator<Person> iterator = ts.iterator();
        while(iterator.hasNext()) {
        	Person person = iterator.next();
        	System.out.println(person);
        }
	}
}
