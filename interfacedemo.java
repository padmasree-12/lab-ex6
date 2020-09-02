/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author padma
 */
public class interfacedemmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      restaurant rs=new restaurant();
      
      rs.calculatebill();
      System.out.println("Total bill:");
      rs.display();
      supermarket sm=new supermarket();
      
      sm.calculatebill();
      System.out.println("Total bill:");
      sm.display();
        // TODO code application logic here
    }
    
}
interface printable
{
    
     
     double mealcost=350;
     double fruitscost=200;
     double vegetablecost=250;
    
     abstract void calculatebill();
     abstract void display();
}

 class restaurant implements printable
{
      public  void calculatebill()
    {
      System.out.println("\n meal cost is:"+mealcost);
      
    }
    public  void display()
    {
        
       double tax;
       double bill;
      
       tax=0.05*mealcost; 
       bill=mealcost+tax;   
       System.out.println(bill);
    
        
    }
}
class supermarket implements printable
{
      public  void calculatebill()
    {
      System.out.println("\n total fruits cost:"+ fruitscost);
      System.out.println("\n total cost of :"+vegetablecost);
     
    }
    public  void display()
    {
       
       double bill;
       
        
       bill=fruitscost+vegetablecost;   
       System.out.println(bill);
    
        
    }
}
