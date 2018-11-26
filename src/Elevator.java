import java.util.*;
import java.io.*;
public class Elevator {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("elevator.dat");
		Scanner reader = new Scanner(file);
		int numberOfTest = Integer.parseInt(reader.nextLine());
		int TotalWeight = 0;
		String[] Tokens;
		for(int i = 0; i < numberOfTest; i++) {
			Tokens = reader.nextLine().split("\\s");
			for(int j = 0; i < Tokens.length; j++) {
				TotalWeight += Integer.parseInt(Tokens[j]);
				if(TotalWeight > 2000) {
					System.out.println(j);
					TotalWeight = 0;
					break;
				}
			}			
		}
		reader.close();
	}

}
