public class inttostring {


	public static int convert_String_To_Number(String numStr) {
		char ch[] = numStr.toCharArray();
		int sum = 0;
		//get ascii value for zero
		int zeroAscii = (int)'0';
		for (char c:ch) {
			int tmpAscii = (int)c;
			sum = (sum*10)+(tmpAscii-zeroAscii);
		}
		return sum;
    }
     public static void main(String a[]) {
     System.out.println("123456, -2, 3c, 0010 == "+convert_String_To_Number("123456, -2, 3c, 0010"));
    
    
 
     }
     }