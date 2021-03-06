import java.util.*;

class ComputeSquare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i = 0; i < 10; i++)
			ar[i] = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < 10; i++)
			sum += Math.pow(ar[i], 2);
		
		System.out.println("Sum of squared of entered 10 numbers: "+sum);
	}
}