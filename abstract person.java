
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author padma
 */
public class abstractperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student obj=new student();
        obj.getdata();
        obj.display();
        faculty obj1=new faculty();
        obj1.getdata();
        obj1.display();
        // TODO code application logic here
    }
    
}
abstract class person
{
   
    abstract void getdata();
    abstract void display();
    Scanner obj=new Scanner(System.in);
    String memname;
    long aadharno;
   
    
    
}
class student extends person
{
    double marks;
    void getdata()
    {
         System.out.println("\nMember name:");
         memname=obj.next();
         System.out.println("\nAadharno:");
         aadharno=obj.nextLong();
         System.out.println("\nMarks secured:");
         marks=obj.nextDouble();
         
         
    }
    void display()
    {
        System.out.println("Member name:"+memname);
        System.out.println("Aadhar number:"+aadharno);
        System.out.println("Marks secured:"+marks);
        
    }
    
}
class faculty extends person
{
    double salary;
    void getdata()
    {
         System.out.println("\nMember name:");
         memname=obj.next();
         System.out.println("\nAadharno:");
         aadharno=obj.nextLong();
         System.out.println("\nSalary:");
         salary=obj.nextDouble();
         
    }
    void display()
    {
        System.out.println("Member name:"+memname);
        System.out.println("Aadhar number:"+aadharno);
        System.out.println("Salary:"+salary);
    }
}