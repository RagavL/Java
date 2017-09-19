import java.util.Scanner;

public class Prime{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number:");
int a = scan.nextInt();
if (a == 2)
{
 System.out.println("The Number is Prime");
}
else
if ((a%a == 0) && (a%1 == 0) && (a%2 != 0))
{
 System.out.println("The Number is Prime");

}
else
{

System.out.println("The Number is NOT Prime");

}

}//main
}//class