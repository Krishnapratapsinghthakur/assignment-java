// 31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=9;a<=n;a++)
        {
            System.out.print(i);
            System.out.print("  ");
            i=(i*10)+9;
           
        }
    }
}