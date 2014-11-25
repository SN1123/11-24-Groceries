// class to store list of Grocery items
public class GroceryItem
{
  String name;
  int quantity;
  double pricePerUnit;
  
  public GroceryItem(String name2, int quantity2, double pricePerUnit2)
  {
    name=name2;
    quantity=quantity2;
    pricePerUnit=pricePerUnit2;
  }
  public double getCost ()
  {
    double x = quantity * pricePerUnit;
    return x;
  }
  public void setQuantity (int quantity)
  {
    this.quantity = quantity;
  }
  public String toString ()
  {
    return quantity + name + "@ $" + pricePerUnit + "= $" + (pricePerUnit * quantity);
  }
}
