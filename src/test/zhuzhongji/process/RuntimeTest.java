package test.zhuzhongji.process;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class RuntimeTest {
	/**
	 * @author：zhuzhongji
	 * @date： 2016-1-7 下午10:09:52
	 */
	public static void main(String[] args) {
		try {
			Process exec = Runtime.getRuntime().exec("ipconfig /all");
			BufferedInputStream inputStream = new BufferedInputStream(exec.getInputStream());
			OutputStream outputStream = exec.getOutputStream();
			
			byte[] buf = new byte[1024];
			while(inputStream.read(buf) != -1){
				outputStream.write(buf, 0, buf.length);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
