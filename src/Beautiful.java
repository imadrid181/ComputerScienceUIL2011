import java.util.*;
import java.io.*;
public class Beautiful {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("beautiful.dat");
		Scanner reader = new Scanner(file);
		int numberOfDonators = Integer.parseInt(reader.nextLine());
		double sum = 0;
		String[] Tokens;
		for(int i = 0; i < numberOfDonators; i++) {
			Tokens = reader.nextLine().split("\\s");
			sum += Double.parseDouble(Tokens[1]);
		}
		System.out.println(sum);
		reader.close();
	}

}
