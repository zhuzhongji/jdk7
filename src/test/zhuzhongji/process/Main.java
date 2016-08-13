package test.zhuzhongji.process;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	/**
	 * @author：zhuzhongji
	 * @date： 2016年7月24日 下午8:07:53
	 */
	public static void main(String[] args) throws Exception { 
        DomainObject obj = new DomainObject();; 
//        obj.setAge(29);; 
//        obj.setName("fankai");; 
        FileOutputStream fos = new FileOutputStream("d:/DomainObject.txt");; 
        ObjectOutputStream oos = new ObjectOutputStream(fos);; 
        oos.writeObject(obj);; 
        oos.close();; 
        fos.close();; 
    } 
}
