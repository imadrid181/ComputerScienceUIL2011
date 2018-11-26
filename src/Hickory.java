import java.util.*;
import java.io.*;
public class Hickory {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("hickory.dat");
		Scanner reader = new Scanner(file);
		int lineNumber = 0;
		while(reader.hasNext()) {
			if(lineNumber == 0) {
				System.out.println(reader.nextLine());
				lineNumber++;
			}
			else {
				reader.nextLine();
				if(reader.hasNext()) {
					System.out.println(reader.nextLine());
					lineNumber++;
				}
				else
					break;				
			}
				
		}
		reader.close();
	}
}
