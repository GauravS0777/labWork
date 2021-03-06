import java.util.*;

class Combinations
{

	static void printArray(int digits[])
	{
		for(int i = 0; i < digits.length; i++)
			System.out.print(digits[i] + " ");

		System.out.println("");

	}

	static void printCombinations(int digits[], int left, int right)
	{
		if(left == right)
			printArray(digits);
		
		for(int i = left; i <= right; i++)
		{
			int temp = digits[left];
			digits[left] = digits[i];
			digits[i] = temp;	
		
			printCombinations(digits, left+1, right);

			digits[i] = digits[left];
			digits[left] = temp;
		}

	}


	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int digits[] = new int[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Digit " + (i+1) + ": ");
			digits[i] = sc.nextInt();
		}
		
		printCombinations(digits, 0, digits.length-1);
	}

}