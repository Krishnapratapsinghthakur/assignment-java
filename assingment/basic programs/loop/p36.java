// 36) WAP to reverse a number
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int count=0;
        while(n>0)
        {
            System.out.print(n%10);
            n=n/10;
            // count++;

        }
        // System.out.print(count);
    }
}