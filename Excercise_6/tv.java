import java.util.Scanner;
	

	public class tv {
	public static void main(String[] args) {
		

		
		double oldTvHeight = 0;
		double oldTvWidth = 0;
		double oldTvArea = 0;
		double newTvHeight = 0;
		double newTvWidth = 0; 
		double newTvArea = 0;
		double oldTvDimensions = 1.3334 ; // 4/3
		double newTvDimensions = 1.7778; // 16/9
		
		
		Scanner newValue = new Scanner(System.in);
		System.out.println("Please give the value of diagonal for old TV : ");
		double diagonal = newValue.nextDouble();
		System.out.println("The diagonals you entered for old TV are " + diagonal + "cm\n");
		
		oldTvHeight = diagonal /(Math.sqrt(Math.pow(oldTvDimensions,2)+ 1)); 
		System.out.println("When the diagonal of the old TV is " + diagonal+ "cm" +  " then the height of the old TV will be " + Math.round(oldTvHeight)+ "cm\n");
		
		oldTvWidth = (oldTvDimensions)*(oldTvHeight);
		System.out.println("And the width of old Tv is " +  Math.round(oldTvWidth) + "cm\n");
		
		oldTvArea = oldTvHeight*oldTvWidth;
		System.out.println("The area of old tv is " + Math.round(oldTvArea) + "cm^2\n");
		
		
		
		
		
		
		
		double newTvDiagonal  = diagonal*1.44;
		
		System.out.println("The new diagonal of the TV is " + Math.round(newTvDiagonal)+ "cm\n");
		
		newTvHeight = newTvDiagonal/(Math.sqrt(Math.pow(newTvDimensions,2)+ 1)); 
		System.out.println("When the diagonal of the new TV is " + Math.round(newTvDiagonal) + "cm" +  " then the height of the new TV will be " + Math.round(newTvHeight)+ "cm\n");
		
		newTvWidth = (newTvDimensions)*(newTvHeight);
		System.out.println("And the width of new Tv is " +  Math.round(newTvWidth)+ "cm\n" );
		
		newTvArea = newTvHeight*newTvWidth;
		System.out.println("The area of new tv is " + Math.round(newTvArea)+ "cm^2\n");
		
		
/* If Diagonal is 51 cm 

When the diagonal of the old TV is 51.0cm then the height of the old TV will be 31cm

And the width of old Tv is 41cm

The area of old tv is 1248cm^2

The new diagonal of the TV is 73cm

When the diagonal of the new TV is 73cm then the height of the new TV will be 36cm

And the width of new Tv is 64cm

The area of new tv is 2305cm^2 */
		
		
		
		}
	}


