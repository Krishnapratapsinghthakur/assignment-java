// 40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0,oddcount=0,evencount=0;
        while(n>0)
        {
            digit=n%10;
            if(digit%2==0)
            {
                evencount++;

            }
            else{
                oddcount++;
            }
            n=n/10;
            

        }
        System.out.println(oddcount);
        System.out.println(evencount);
        
    }
}