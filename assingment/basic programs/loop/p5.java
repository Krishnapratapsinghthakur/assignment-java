// 5) WAP to find out the factorial of a number.
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println(fac);
    }
}