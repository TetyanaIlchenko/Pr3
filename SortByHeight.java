import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class SortByHeight {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = null;
		String[] minAndMax = null;
		String line = "";

		int n = 6;
		int max = 12;
		int min = 6;
		int counter = 3;
		int number = 2;

		
		
		while(true) {
			line = read.readLine();
			if(line == null)
				break;
			n = Integer.parseInt(line);
			numbers = read.readLine().split(" ");
			minAndMax = read.readLine().split(" ");
			min = Integer.parseInt(minAndMax[0]);
			max = Integer.parseInt(minAndMax[1]);
			for(int i = 0; i<n; i++) {
				number = Integer.parseInt(numbers[i]);
				if(number >= min && number <= max)
					counter++;
			}
			System.out.println(counter);
			
		}
	}
}