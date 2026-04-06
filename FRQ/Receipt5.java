package FRQ;

import java.util.Scanner;
/**
 * Receipt3.java  
 *
 * @author – Your name
 * @author – Class period
 */ 
public class Receipt5
{
   public static void main(String [] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your school's name: ");
        String schoolName = input.nextLine();
        double drinkPrice = 1.50;
        double candyPrice = 1.25;
        double hotDogPrice = 2.75;
        double hamburgerPrice = 3.50;
        int orderNumber = (int) (Math.random() * 100) + 1;
        
        System.out.println("Enter drink quantity purchased: ");
        int drinkQty = input.nextInt();
        System.out.println("Enter candy quantity purchased: ");
        int candyQty = input.nextInt();
        System.out.println("Enter hot dog quantity purchased: ");
        int hotDogQty = input.nextInt();
        System.out.println("Enter hamburger quantity purchased: ");
        int hamburgerQty = input.nextInt();

        double drinkTotal = drinkPrice * drinkQty;
        double candyTotal = candyPrice * candyQty;
        double hotDogTotal = hotDogPrice * hotDogQty;
        double hamburgerTotal = drinkPrice * hamburgerQty;

        double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal;
        double tax = (subtotal * 0.05) * 100;
        double finalTax = Math.floor(tax) / 100; 
        double total = subtotal + finalTax;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*         " + finalSchoolName + " Snack Bar             *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........$" + drinkPrice + "           *");                      
        System.out.println("*     Candy ..........$" + candyPrice + "          *");     
        System.out.println("*     Hot Dog ........$" + hotDogPrice + "          *");     
        System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");     
        System.out.println("*                                    *");    
        System.out.println("**************************************");
        System.out.println("*  Order Number " + orderNumber + "                   *");
        System.out.println("*                                    *"); 
        System.out.println("*      QTY      ITEM       TOTAL     *"); 
        System.out.println("**************************************");
        System.out.println("       " + drinkQty + "       Drink       " + drinkTotal + "      ");
        System.out.println("       " + candyQty + "       Candy       " + candyTotal + "      ");
        System.out.println("       " + hotDogQty + "       Hot Dog     " + hotDogTotal + "     ");
        System.out.println("       " + hamburgerQty + "       Hamburger   " + hamburgerTotal + "      ");
        System.out.println("**************************************");
        System.out.println("      Subtotal      " + subtotal + "                              "); 
        System.out.println("      Tax           " + finalTax + "                              "); 
        System.out.println("      Total         " + total + "                             "); 
        

   }
}
