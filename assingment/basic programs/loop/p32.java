// 32) A	b	C	d	E	f	G	h	…… n terms 
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        char ch = 'A';  

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                System.out.print(ch + " ");  
            } else {
                System.out.print((char)(ch + 32) + " ");  
            }
            ch++; 
        }
    }
}