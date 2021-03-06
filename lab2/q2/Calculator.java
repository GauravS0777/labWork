class Calculator
{

public static void main(String[] args)
{

if(args.length != 3)
{System.out.println("There should be exact three command line arguments ");}

else
{
float num1 = Float.parseFloat(args[0]);
String operation = args[1];
float num2 = Float.parseFloat(args[2]);
float result = 0;

if(operation.equals("+"))
{result = num1 + num2;}

else if(operation.equals("-"))
{result = num1 - num2;}

else if(operation.equals("*"))
{result = num1 * num2;}

else if(operation.equals("/"))
{result = num1 / num2;}

else if(operation.equals("%"))
{result = num1 % num2;}

else
{
System.out.println("Invalid operation");
return;
}

System.out.println("Result = "+result);
}
}

}