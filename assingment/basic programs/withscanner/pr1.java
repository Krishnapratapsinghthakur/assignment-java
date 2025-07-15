 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
           int length,breadth,perimeter,area;
        
        System.out.println("enter the value of length");
        length=sc.nextInt();
        System.out.println("enter the value of perimeter");
        perimeter=sc.nextInt();
        breadth=(perimeter/2)-length;
        System.out.println("the breadth of the recatangle is :"+breadth);

        area=length*breadth;
        System.out.println("the area of the recatangle is :"+area);
        // orignal  answer 
        // the breadth of the recatangle is :45
// the area of the recatangle is :3150
    }
}