import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       int marks;
       char grade='a';
       marks=sc.nextInt();
       if(marks<25)
       {
        grade='f';
       }
       else if(marks>=25 && marks<45)
       {
        grade='e';
       }
       else if(marks>=45 && marks<50)
       {
        grade='d';
       }
       else if(marks>=50 && marks<60)
       {
        grade='f';
       }
       else if(marks>=60 && marks<80)
       {
        grade='b';
       }
       else if(marks>80)
       {
        grade='a';
       }
       System.out.println(grade);

    }

}