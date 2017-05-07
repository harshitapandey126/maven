
import java.util.*;
import java.util.Scanner;

class happyNumber
{
  public static void main(String[] args)
  {
   Scanner sn=new Scanner(System.in);
   int s,num;
   System.out.println("Enter the number to be checked");
   num=sn.nextInt();
   s=SumSqDigits(num);
   while(s>9)
   {
   s=SumSqDigits(s);
   }
   if(s==1)
    System.out.println("The number is a happy number");
    else
    System.out.println("The number is not a happy number");
   }
  
  
  public static int SumSqDigits(int n)
   {
    int sum=0,d;
    while(n>0)
    {
    d=n%10;
    sum=sum+(d*d);
    n=n/10;
    }
    return sum;
   }
 }