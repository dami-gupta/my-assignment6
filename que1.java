import java.util.Scanner;
class child
{
public void display()
{
System.out.println("Immediate parent accessed without creating an object");
}
}
class parent extends child
{
parent()
{
super.display();
}
}
class que1
{
public static void main(String args[])
{
parent p = new parent();
}
}