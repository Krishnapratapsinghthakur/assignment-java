// 22) 1	8	27	64	125	…..
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i*i*i);
        }
    }
}