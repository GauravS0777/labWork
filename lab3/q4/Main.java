class Main
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 45; i < 250; i += 5)
			sum += i;

		System.out.println("Sum of numbers > 40, < 250 and divisible by 5: " + sum);
	}
} 	