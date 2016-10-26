import java.util.*;
class SumDigit
{
public static void main(String args[])
{
try
{
long n,sum=0,rem=0,rev=0;
Scanner sc=new Scanner(System.in);
n=sc.nextLong();
long num=n;
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("The sum is:"+sum);
long res=sum;
while(sum>0)
{
rem=sum%10;
rev=rev*10+rem;
sum=sum/10;
}
if(rev==res)
{
System.out.println("The sum of digits is a palindrome");
}
else
{
System.out.println("The sum of digits is not a palindrome");
}
}
catch(Exception e)
{
}
}
}
