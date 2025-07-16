import java.util.Scanner;
// 10. Print number between 1 to 5 in word format 
class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        switch (a) {
    case 1:
        System.out.println("one");
        break;
    case 2:
       System.out.println("two");
        break;
     case 3:
        System.out.println("three");

       
        break;
     case 4:
        System.out.println("four");
       
        break;
     case 5:
       System.out.println("five");
        break;
    
    default:
       
        break;
} 
    }

}