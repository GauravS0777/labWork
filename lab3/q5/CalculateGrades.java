import java.util.*;

class CalculateGrades
{
	static void bubbleSort(int[] marks)
	{
		for(int i = 1; i < marks.length; i++)
		{
			for(int j = 0; j<marks.length-i; j++)
			{
				if(marks[j] > marks[j+1])
				{
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}	
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[10];
		System.out.println("Enter marks of 10 students: ");
		for(int i = 0; i < 10; i++)
			marks[i] = sc.nextInt();
		
		bubbleSort(marks);
		
		System.out.println("\nGrades: ");
		for(int i = 0; i < 10; i++)
		{
			if(marks[i] < 40)
				System.out.println("FAIL");
			else if(marks[i] <= 50)
				System.out.println("PASS");
			else if(marks[i] <= 75)
				System.out.println("MERIT");
			else
				System.out.println("DISTINCTION");
		}
	}
}