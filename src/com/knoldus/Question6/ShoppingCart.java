package com.knoldus.Question6;
class Item
{
    double cost;
    int quantity;
    Item(double cost, int quantity)
    {
        this.cost=cost;
        this.quantity=quantity;
    }
}
public class ShoppingCart {

    double totalcost=0;
    double getTotalcost(Item item)
    {
        totalcost=totalcost+(item.quantity*item.cost);
        return totalcost;
    }

    public static void main(String[] args) {
        Item item1=new Item(500,3);
        Item item2=new Item(500,3);
        ShoppingCart shoppingCart=new ShoppingCart();
        double total=shoppingCart.getTotalcost(item1)+ shoppingCart.getTotalcost(item2);
        // Printing the total cost of item1 and item2
        System.out.println("Total cost: " + total);
    }
}

