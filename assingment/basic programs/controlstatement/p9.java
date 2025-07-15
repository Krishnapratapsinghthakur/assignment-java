import java.util.Scanner;
// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char character=sc.next().charAt(0);
        if(character>='a' && character<='z')
        {
            System.out.print("the character is in lowercase");
        }
        else if(character>='A' && character<='Z')
        {
            System.out.println("the character is in uppercase");
        }
    else{
         System.out.println("the character you entered is not an alphabet");
    }
       


    }
}