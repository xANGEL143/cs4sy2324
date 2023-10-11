import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0;
      
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList<>();
    
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList 
    
    if (index < itemList.size() && index >= 0){
        Item sold = itemList.get(index);
        earnings += sold.getCost(); // get Item at index from itemList and add its cost to earnings
        System.out.printf("Sold %s for %.2f%n", sold.getName(), sold.getCost());  
    }

    else{
      System.out.println("There are/is only " + itemList.size() + " item/s in the store."); //print statement that there are only x items in the store.
    }
  }
  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it) 
    boolean found = false;

    for (Item item : itemList){
      if(item.getName().equals(name)){
        earnings += item.getCost();  // get Item at index from itemList and add its cost to earnings
        System.out.printf("Sold %s for %.2f.%n", item.getName(), item.getCost()); // print statement indicating the sale
        found = true; 
        break; 
      }
    }

    if(!found){
      System.out.println("There are no items in the store with the name " + name); //print statement that there are no items in the store with that name.
    }

  }
  
  public void sellItem(Item i){  
    if (itemList.contains(i)){
      earnings += i.getCost(); // get Item at index from itemList and add its cost to earnings
      System.out.printf("Sold %s for %.2f%n", i.getName(), i.getCost()); // print statement indicating the sale
    }
      
    else{
      System.out.println("The store does not sell this item."); //print statement that there are no items in the store with that name.
    }
  }
  
  public void addItem(Item i){
    itemList.add(i); // add Item i to store's itemList
  }

  public void filterType(String type){
    for (Item i : itemList){
     if(i.getType().equals(type)){
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost()); // print the name of the item   
      }
    }
  }
    
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    
    for (Item i : itemList){
      if(i.getCost() <= maxCost){
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost()); // print the name of the item   
      }
    }
  }
  
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    
    for (Item i : itemList){
      if(i.getCost() >= minCost){
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost()); // print the name of the item   
      }
    }
  }
  
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    
    for (Store s : storeList){
      System.out.printf("Store Name: %s%nEarnings: %.2f%n", s.getName(), s.getEarnings()); // print the name of the store and the earnings
    }
  }
}
