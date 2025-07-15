import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       char youngest='a',oldest;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>b && a>c)
       {
        oldest='a';
    }
       else if(b>c && b>a)
       {
        oldest='b';
       }
       else
       {
        oldest='c';
       }
       System.out.println(oldest);

       if(oldest=='a' && b>c)
       {
        youngest='c';
       }
       else if(oldest=='b' && a>c)
       {
        youngest='c';
       }
       else if(oldest=='c' && b>a)
       {
        youngest='a';
       }
       System.out.println(youngest);
        
    }

}