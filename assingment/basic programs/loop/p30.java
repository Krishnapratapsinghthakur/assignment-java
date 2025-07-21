// 30) 1+11+111+1111+11111+…. 
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;a<=n;a++)
        {
            System.out.print(i);
            System.out.print("+");
            i=(i*10)+1;
           
        }
    }
}