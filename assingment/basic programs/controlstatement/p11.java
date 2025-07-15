import java.util.Scanner;

class Test{
//     11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.
// if employee is a male and age is in between 20 to 40 then he may work in anywhere
// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
// And any other input of age should print "ERROR".  
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        char maritalStatus,sex;
        maritalStatus=sc.next().charAt(0);
        sex=sc.next().charAt(0);
        if(sex=='f')
        System.out.println("she will only work in urban area");
        else if(sex=='m')
        {
            if(age>=20 && age<40)
            {
                System.out.println("he may work anywhere");
            }
            else if(age>=40 && age<=60 )
            {
                System.out.print("he will work only in urban area");
            }
            else{
                System.out.println("ERROR");
            }
        }



        
        
    }

}