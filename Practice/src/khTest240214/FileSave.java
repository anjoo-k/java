package khTest240214;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
	
	public void fileSave(String fileName){
		
		FileWriter fw = null;
		
		try {
			
			Food fruit = new Food("사과", 20);
			
			fw = new FileWriter(fileName);
			
			fw.write(fruit.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		FileSave fs = new FileSave();
		fs.fileSave("Food");

	}

}
