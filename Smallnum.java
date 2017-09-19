import java.util.*;

class Smallnum{

public static void main(String[] args)
{
  
int num[] = new int[6];
int temp;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the five Numbers:");

for(int i=0;i<5;i++)
{
 
num[i] = scan.nextInt();
}

for(int i =0;i<5;i++)
{
 for(int j=0;j<5;j++)
 {
   if(num[i+1] < num[i])
   {
     temp = num[i+1];
     num[i+1]=num[i];
      num[i]= temp;
    }
  }
}

System.out.println("The Smallest Number is:"+num[0]);

}//main
}//class