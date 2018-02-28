import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Properties;

public class HashTableTest {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.setProperty("name", "张三 ");
		prop.setProperty("age", "18");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("b.txt");
            prop.list(pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close();
			}
		}
	}

}
