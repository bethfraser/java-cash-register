import java.math.BigDecimal;

public class Item {

  public String name;
  public BigDecimal price;

  public Item(String inputName, String inputPrice)
  {
    name = inputName;
    price = new BigDecimal(inputPrice);
    // System.out.println("Added: " + name + ", £" + inputPrice);
  }

  
}