import java.util.Scanner;
// Check given character is vowel or not using switch case
class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        switch (a) {
    case 'a':
      System.out.println("the letter you enterd is vovel");
        break;
    case 'e':
        System.out.println("the letter you enterd is vovel");

    
        break;
case 'i':
      System.out.println("the letter you enterd is vovel");
        break;
        
        case 'o':
      System.out.println("the letter you enterd is vovel");
        break;
        case 'u':
      System.out.println("the letter you enterd is vovel");
        break;
        default:
                System.out.println("consonant");
        }}

}