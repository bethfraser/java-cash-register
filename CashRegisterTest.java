import java.util.Scanner;
import java.math.BigDecimal;

/**
   A class to test the CashRegister class.
*/
   public class CashRegisterTest
   {
      public static void main(String[] args)
      {
         Item banana = new Item("Banana", "0.99");
         Item apple = new Item("Apple", "0.50");
         Item beans = new Item("Baked beans", "1.25");
         Item[] myArray = {banana, apple, beans};
         CashRegister register = new CashRegister();
         Scanner in = new Scanner(System.in);

         char answer = 'y';
         System.out.println("Welcome to Beth's Shop!");
         while(answer == 'y'){
            System.out.println("Choose an item:\n 1. Banana - £0.99\n 2. Apple - £0.50\n 3. Baked beans - £1.25");
            int choice;
            choice = in.nextInt();
            Item chosenItem = myArray[choice-1];
            System.out.println("You chose: " + myArray[choice - 1].name);
      // System.out.println("Enter first item price:");
      // BigDecimal item1;
      // item1 = in.nextBigDecimal();
      // System.out.println("Enter second item price:");
      // BigDecimal item2;
      // item2 = in.nextBigDecimal();

            register.recordPurchase(chosenItem);
            System.out.println("Running total: £" + register.purchase);
            System.out.println("Add another item? (y/n): ");
            answer = in.next().charAt(0);
         }

         System.out.println("Total purchase amount: £" + register.purchase);
         System.out.println("Enter payment amount:");
         BigDecimal amount;
         amount = in.nextBigDecimal();
         register.enterPayment(amount);
         String change = register.giveChange();
         System.out.println(change);      
      }
   }
