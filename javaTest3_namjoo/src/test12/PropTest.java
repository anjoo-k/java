package test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Scanner;

public class PropTest {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//{1=apple,1200,3, 2=banana,2500,2, 3=grape,4500,5, 4=orange,800,10, 5=melon,5000,2}
			 Properties prop = new Properties();

			 
			 prop.setProperty("1", "apple, 1200, 3");
			 prop.setProperty("2", "banana, 2500, 2");
			 prop.setProperty("3", "grape, 4500, 5");
			 prop.setProperty("4", "orange, 800, 10");
			 prop.setProperty("5", "melon, 5000, 2");
			 
			
			 // Enumeration e = prop.propertyNames();

			 
			 
			 
			 
			 
			 //명시한 사용 데이터를 prop 에 기록한다.
			 // fileSave() 메소드를 호출한다.
			 fileSave(prop);

			 // fileOpen() 메소드를 호출한다
			 fileOPen(prop);
		
		
		
		
	}
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "Property Example");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	 
		
		
	}
	
	public static void fileOPen(Properties p) {
		
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			
			Enumeration e = p.propertyNames(); //key만 모아서 가져오고 싶으면 propertyNames()
			Fruit[] fArr = new Fruit[p.size()];
			
			for(Fruit f : fArr) {
				String key = (String) e.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				for(int i = 0; i < fArr.length; i++) {
					System.out.println(key + "=" + f.toString());
				}
			}
			
		
			
		} catch (InvalidPropertiesFormatException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
