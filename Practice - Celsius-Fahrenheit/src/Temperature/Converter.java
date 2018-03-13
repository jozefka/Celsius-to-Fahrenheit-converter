package Temperature;
import java.util.Arrays;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("List of temperatures in Celsius: ");
		String n = input.nextLine();
		String[] celsiusNumbersStr = n.split(" ");
		int[] celsiusNumbersInt = new int[celsiusNumbersStr.length];
		
		for ( int i = 0; i < celsiusNumbersStr.length; i++) {
			celsiusNumbersInt[i] = Integer.parseInt(celsiusNumbersStr[i]);
		}
		
		//int inputNumber = celsiusNumbersInt[celsiusNumbersInt.length];
		int[] fahrenheitNumbersInt = new int[celsiusNumbersInt.length];
		for (int j = 0; j < celsiusNumbersInt.length; j++) {
			fahrenheitNumbersInt[j]= celsiusNumbersInt[j] * 9/5 + 32;
		}
		System.out.println("Result in Fahrenheit: " + Arrays.toString(fahrenheitNumbersInt));
		input.close();
		
		
		
	
	}

}
