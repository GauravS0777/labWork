class Main
{

public static void main(String args[])
{

MyClass ob = new MyClass();
System.out.println("MyClass object is created");

ob.setData(5);
int data = ob.getData();
System.out.println("Data value: "+data);

}

}