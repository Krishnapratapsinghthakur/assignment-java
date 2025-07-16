import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        double totalMarks=sc.nextFloat(),marksGet=sc.nextFloat();
        double percentage=(marksGet/totalMarks)*100;
        System.out.println(percentage);
        
        
    }

}