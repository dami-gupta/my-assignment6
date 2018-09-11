import java.util.Scanner;
final class parent
{
//cannot be extended
}
class child extends parent
{
child()
{
System.out.println(" hello ");
}
}
class que3
{
public static void main(String args[])
{
child p = new child();
}
}