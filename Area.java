import java.util.Scanner;
class Area
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
int l,b,c;
System.out.println("enter length and breadth");
l=kb.nextInt();
b=kb.nextInt();
c=l*b;
System.out.println("the area of rectangle is " +c);
}
}