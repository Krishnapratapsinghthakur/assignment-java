import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       int salary,yos;
       salary=sc.nextInt();
       yos=sc.nextInt();
       if(yos>5)
       {
        int bonus=(salary/100)*5;
        salary=salary+bonus;
        System.out.println(salary);
       }
        else
        System.out.println(salary);
    }

}