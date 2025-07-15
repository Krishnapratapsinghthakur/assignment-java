import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        if(length==breadth)
        {
            System.out.println("squre");
        }
        else
        System.out.println("not squre");
        
    }

}