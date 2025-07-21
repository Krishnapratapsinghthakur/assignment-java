import java.util.Scanner;
// 4) WAP to print table of a number.
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }

    }
}