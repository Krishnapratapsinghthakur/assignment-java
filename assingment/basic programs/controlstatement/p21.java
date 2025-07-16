import java.util.Scanner;
// 6. WAP to find greater among two number 

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if(a==b)
        {
            System.out.println("both no are equal");
        }
        else if(a>b)
        {
            System.out.println("a is grater than b");


        }
        else
        System.out.println("b is grater than a ");
        
        
    }

}