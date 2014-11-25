// class to represent a grocery item
// class to store list of Grocery items 
public class GroceryItem
{
  String name;
  int quantity;
  double pricePerUnit;
  
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
