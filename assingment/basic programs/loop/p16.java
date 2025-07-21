// 16) …... -6	-3	0	3	6	9	……. n terms

import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=-n;i<=n;i++)
        {
            System.out.println(i);
            
        }
    }
}