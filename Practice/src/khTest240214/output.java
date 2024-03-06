package khTest240214;

import java.io.FileWriter;
import java.io.IOException;

public class output {
	public void output() {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("test.txt");
			fw.write("97");
			fw.write("65");
			fw.write("50");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
