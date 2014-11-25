// class to store list of Grocery items 
import java.util.*;
// class to represent a grocery item

public class GroceryList
{
  ArrayList<GroceryItem>list;
  
  public String toString ()
  {
    String s = "";
    for (int i = 0; i < list.size(); i++)
    {
      s += list.get(i).toString() + "\n"; 
    }
    return s;
  }
  public GroceryList ()
  {
    list = new ArrayList<GroceryItem>();
  }
  public void add (GroceryItem item)
  {
    list.add(item);
  }
  public double getTotalCost ()
  {
    double sum = 0.0;
    for (int j = 0; j<list.size(); j++)
    {
     sum += list.get(j).getCost();
    }
    return sum;
  }
}
  
  
