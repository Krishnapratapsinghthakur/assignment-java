 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int length,breadth,deep,vol;
          System.out.println("enter the length");
        length=sc.nextInt();
           System.out.println("enter the breadth");
        breadth=sc.nextInt();
           System.out.println("enter the deapth");
        deep=sc.nextInt();
        vol=length*breadth*deep;
        System.out.println(vol);
    }
}