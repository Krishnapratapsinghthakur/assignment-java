// 33) WAP to print Alphabets in reversing order.
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        

        char ch = 'Z';  

        for(int i = 1; i <= 26; i++) {
            System.out.println(ch);
            ch--; 
        }
    }
}