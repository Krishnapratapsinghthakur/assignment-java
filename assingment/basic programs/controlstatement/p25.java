//  WAP to check wheater number is positive or negative
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a>=0)
        {

            System.out.println("the no you entered is postive");
            
        }
        else
        System.out.println("the no you entered is negetive");

    }
}