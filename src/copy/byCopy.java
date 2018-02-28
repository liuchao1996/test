package copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class byCopy {

	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		copy();
		long endTime = System.currentTimeMillis();
		System.out.println("耗时:"+(endTime - starTime));
	}

	public static void copy() {

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new BufferedInputStream( new FileInputStream("D:\\Desert.jpg"));
			out = new BufferedOutputStream(new FileOutputStream("o.jpg"));
			byte[] data = new byte[1024];
			int len =-1;
            while( (len = in.read(data)) != -1 ) {
            	out.write(data, 0, len);
            }
            out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
