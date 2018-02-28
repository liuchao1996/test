package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class read {

	public static void main(String[] args) {
        Properties prop = new Properties();
		FileReader  fr = null;
		try {
			fr = new FileReader("src/application.properties");
            prop.load(fr);
            String name = prop.getProperty("name");
            String age = prop.getProperty("age");
            System.out.println(name +"=="+age);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
