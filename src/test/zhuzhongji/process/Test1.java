package test.zhuzhongji.process;

public class Test1 {
	/**
	 * @author：zhuzhongji
	 * @date： 2016年7月24日 下午5:14:38
	 */
	public static void main(String[] args) {
		T1 t1 = new T1();
        T2 t2 = new T2();

        System.out.println("t1: " + (t1 instanceof java.io.Serializable));
        System.out.println("t1: " + (t2 instanceof java.io.Serializable));
	}
}
