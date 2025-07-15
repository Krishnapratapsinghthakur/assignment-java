import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int quantity=sc.nextInt();
        int totalmoney=quantity*100;
        if(totalmoney>1000)
        {
           int discount=(totalmoney/100)*10;
           totalmoney=totalmoney-discount;
           System.out.println(totalmoney);
        }
        else
        System.out.println(totalmoney);
        
        
    }

}