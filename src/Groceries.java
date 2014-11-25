// main program to run the GroceryList
public class GroceryMain
{
  public static void Main (String[] args)
  {
    GroceryList list= new GroceryList();
    GroceryItem Item1= new GroceryItem("Oreos", 3, 2.50);
    GroceryItem Item2= new GroceryItem("Goldish", 2, 1.75);
    GroceryItem Item3= new GroceryItem("Apple", 8, 0.23);
    GroceryItem Item4= new GroceryItem("Fruit Loops", 2, 4.32);
    GroceryItem Item5= new GroceryItem("PopTarts", 4, 3.67);
    list.add(Item1);
    list.add(Item2);
    list.add(Item3);
    list.add(Item4);
    list.add(Item5);
    System.out.println(list.toString());
    System.out.print("Total: $" + list.getTotalCost());
  }
}
