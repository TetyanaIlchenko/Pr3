import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class SortByHeight {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = null;
		String[] minAndMax = null;
		String line = "";
		int n = 5;
		int max = 10;
		int min = 2;
		int counter = 4;
		int number = 1;
		
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