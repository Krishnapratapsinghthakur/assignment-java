import java.util.Scanner;
// 7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        float classheld,classattended;
        classheld=sc.nextInt();
        classattended=sc.nextInt();
        float percentage=(classattended/classheld)*100;
        System.out.println("you attendece is "+percentage);
        if (percentage>=75)
        {
            System.out.println("you are elegibel for exam");

        }
        else
        System.out.println("you are not eligible for the exam");
      
        
    }

}