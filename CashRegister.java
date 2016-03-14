import java.math.BigDecimal;
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   public BigDecimal purchase;
   private BigDecimal payment;
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = new BigDecimal("0");
      payment = new BigDecimal("0");
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(Item item)
   {
      BigDecimal total = purchase.add(item.price);
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(BigDecimal amount)
   {
      payment = amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public BigDecimal calculateChange()
   {   
      BigDecimal change = payment.subtract(purchase);
      purchase = new BigDecimal("0");
      payment = new BigDecimal("0");
      return change;
   }

   public String giveChange()
   {
      BigDecimal change;
      change = this.calculateChange();
      System.out.println("Change: £" + change);

      int twentyNotes = 0;
      int tenners = 0;
      int fivers = 0;
      int pounds = 0;
      int fifties = 0;
      int twenties = 0;
      int tens = 0;
      int fives = 0;
      int twos = 0;
      int pennies = 0;


      BigDecimal twentyNote = new BigDecimal("20");
      BigDecimal tenner = new BigDecimal("10");
      BigDecimal fiver = new BigDecimal("5");
      BigDecimal pound = new BigDecimal("1");
      BigDecimal fifty = new BigDecimal("0.5");
      BigDecimal twenty = new BigDecimal("0.2");
      BigDecimal ten = new BigDecimal("0.1");
      BigDecimal five = new BigDecimal("0.05");
      BigDecimal two = new BigDecimal("0.02");
      BigDecimal penny = new BigDecimal("0.01");

      while (change.compareTo(twentyNote) >= 0) {
         change = change.subtract(twentyNote);
         twentyNotes = twentyNotes + 1;
      }
      while (change.compareTo(tenner) >= 0) {
         change = change.subtract(tenner);
         tenners = tenners + 1;
      }
      while (change.compareTo(fiver) >= 0) {
         change = change.subtract(fiver);
         fivers = fivers + 1;
      }
      while (change.compareTo(pound) >= 0) {
         change = change.subtract(pound);
         pounds = pounds + 1;
      }
      while (change.compareTo(fifty) >= 0) {
         change = change.subtract(fifty);
         fifties = fifties + 1;
      }
      while (change.compareTo(twenty) >= 0) {
         change = change.subtract(twenty);
         twenties = twenties + 1;
      }
      while (change.compareTo(ten) >= 0) {
         change = change.subtract(ten);
         tens = tens + 1;
      }
      while (change.compareTo(five) >= 0) {
         change = change.subtract(five);
         fives = fives + 1;
      }
      while (change.compareTo(two) >= 0) {
         change = change.subtract(two);
         twos = twos + 1;
      }
      while (change.compareTo(penny) >= 0) {
         change = change.subtract(penny);
         pennies = pennies + 1;
      }


      return ("£20 notes: "+ twentyNotes + "\n£10 notes: " + tenners + "\n£5 notes: " + fivers + "\n£1 coins: " + pounds + "\n50p coins: " + fifties + "\n20p coins: " + twenties + "\n10p coins: " + tens + "\n5p coins: " + fives + "\n2p coins: " + twos + "\n1p coins: " + pennies);
   }

}
