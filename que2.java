import java.util.Scanner;

class parent
{
parent()
{
System.out.println("default constructor through parameterized constructor of same class");
}
parent(int a)
{
this();
}
}
class que2
{
public static void main(String args[])
{
parent p= new parent(28);
}
}