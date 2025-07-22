// 40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();
        int min=Math.min(a,b);
int i=1,hcf=1;
        while(i<=min)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
            i++;
            

        }
        System.out.print(hcf);
        
    }
}