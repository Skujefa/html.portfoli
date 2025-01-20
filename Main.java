import java.util.Scanner;
public class Main{
    public static void main(String[]args){
     
        Scanner sc = new Scanner(System.in);
     System.out.println("please enter your name");
       
       
        String name =sc.nextLine();
         System.out.println("enter the products you want");

       Double nu=sc.nextDouble();
           Double tax=2.0;
     double shirt=200*tax;
       Double total =shirt*nu;
       
          System.out.println(name+" wants "+nu+" shirts ");

        if (nu<=5){
          System.out.println("product in stock");
          
         System.out.println("After including all taxes = "+ nu +"*"+shirt+" = "+total);
         System.out.println(name+" Shrits ordered = "+nu+" and its total amount = "+total);
       
        }
        
        else{
          System.out.println("And its out of stock");
        }

              
 }
    
}