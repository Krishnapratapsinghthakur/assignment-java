import java.util.Scanner;

class Test{
    // WAP to exchange value to two variable with third variable and without third variable
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        // System.out.println();

      
    }

}