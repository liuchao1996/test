package bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter {

	public static void main(String[] args) {
		bufferwriter();
	}
	
	public static void bufferwriter() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new  FileWriter("a.txt");
		    bw = new BufferedWriter(fw);
		    bw.write("测试测试");
		    bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
