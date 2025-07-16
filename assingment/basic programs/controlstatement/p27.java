import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a%2) {
    case 1:
      System.out.println("the no you entered is odd");
        break;
    case 0:
        System.out.println("the no you entered is even ");

    
        break;
case -1:
      System.out.println("the no you entered is odd");
        break;
 
   
    default:
        
        break;
}

        
    }

}