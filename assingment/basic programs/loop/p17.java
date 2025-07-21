// 17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;a<=n;i=i+2)
        {
            System.out.println(i);
            a++;
            
        }
    }
}