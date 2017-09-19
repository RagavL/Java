import java.util.Scanner;

class Factorial
{


public static void main(String[] args)
{

int fac =1;
  System.out.println("Enter the Number");
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
  for(int i=1;i<=n;i++)
   {
    fac*=i;
     }
System.out.println("Factorial of a Number:"+ fac);
}
}