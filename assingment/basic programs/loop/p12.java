// 12) WAP to print Odd numbers upto N.
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
            
        }
    }
}