import java.util.Scanner;

class Palindrome{


public static void main(String[] args)

{

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the String:");
  String str1 = scan.next();
  int len = str1.length();
  
 int i=0;
 int flag = 0;
  do   
    {

     if(str1.charAt(i) == str1.charAt(len-1))
      {
          i++;
          len--;
      }
   else
    {
      flag = 1;
       break;
    }
}while(i<=len);

if(flag == 1)
{
 System.out.println(" Not Palindrome");
}
else
if(flag == 0)
{
System.out.println("Palindrome");
}

}//end of Main

}//end of class