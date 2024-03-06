package aloneRunStudy;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class Run {
	public static void main(String[] args) {
		
		new AloneStudyRun().fileRead();
		
	}
	
}

public class AloneStudyRun {
	
	public void fileSave() {
		
		try(FileOutputStream fout = new FileOutputStream("a.txt");) {
			fout.write('a');
			fout.write(77);
			
			byte [] arr = {'a', 88, 66};
			fout.write(arr);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		try(FileInputStream fin = new FileInputStream("a.txt")) {
			
			while(true) {
				System.out.println(fin.read());
			}
			
		} catch (EOFException e) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	

}
