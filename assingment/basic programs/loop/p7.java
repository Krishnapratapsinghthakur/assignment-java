// 7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==1){
            System.out.println("this no is prime");

        }
        else{for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                // System.out.println(i);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("this no is prime");
        }
        else 
        System.out.println("this no is not prime");}
        

    }
}