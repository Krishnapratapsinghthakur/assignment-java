// 23) 1	9	25	49	81	…..
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            System.out.println(i*i);
        }
    }
}