import java.util.Arrays;
import java.util.Scanner;

public class Excercise_2{

	public static void main(String[] args) {
		
		// Test the romanNumber Methode
		System.out.println("please give a roman number...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("= " + romanToDecimal(scanner.next()));
		
		// Test the GGT-Methode
		System.out.println("please enter two integer number...");
		System.out.println("the GGT ist " + ggt(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}
	
		// This function returns value of a Roman symbol
		public static int value(char r) {
			if (r == 'I')
				return 1;
			if (r == 'V')
				return 5;
			if (r == 'X')
				return 10;
			if (r == 'L')
				return 50;
			if (r == 'C')
				return 100;
			if (r == 'D')
				return 500;
			if (r == 'M')
				return 1000;
			return -1;
		}

		// Finds decimal value of a given roman numeral
		public static int romanToDecimal(String str) {
			// Initialize result
			int res = 0;

			for (int i = 0; i < str.length(); i++) {
				// Getting value of symbol s[i]
				int s1 = value(str.charAt(i));

				// Getting value of symbol s[i+1]
				if (i + 1 < str.length()) {
					int s2 = value(str.charAt(i + 1));

					// Comparing both values
					if (s1 >= s2) {
						// Value of current symbol is greater
						// or equalto the next symbol
						res = res + s1;
					} else {
						res = res + s2 - s1;
						i++; // Value of current symbol is
						// less than the next symbol
					}
				} else {
					res = res + s1;
					i++;
				}
			}
			if (res <= 1999) {
				return res;
			}else {
				System.out.println("Zahl war größer als MCMXCIX");
				return 0;
			}
		}
	
	/*
	 * The method takes two intege values and outputs the greatest common divisor according to the Euclidean algorithm
	 */
	public static int ggt(int uIOne, int uISecond) {
		int rest, a, b;
		int[] toSort = {uIOne, uISecond};
		Arrays.sort(toSort);
		a = toSort[0];
		b = toSort[1];
		while (b != 0) {
			rest = a%b;
			a = b;
			b = rest;
		}
		return a;
	}
}

	
	
	
	


