package com.modelClass;

import java.util.ArrayList;
import java.util.List;

 class Item
  { private String name;
    private double price;

    //Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
  }

    class ShoppingCart
    { private List<Item> items;

         //Constructor
        public ShoppingCart()
        {
            items = new ArrayList<>();
        }

        // Function to add an item to the cart
        public void addItem(Item item)
        {
            items.add(item);
            System.out.println((item.getName() + " added to the cart."));

        }

        // Function to remove item from the cart
        public boolean removeItem(String itemName) {
            for (Item item : items) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    items.remove(item);
                    System.out.println(itemName + " removed from the cart.");
                    return true;
                }
            }
            System.out.println(itemName + " not found in the cart.");
            return false;
        }

        // Function to calculate the total price of items in the cart
        public double getTotalPrice() {
            double total = 0;
            for (Item item : items) {
                total += item.getPrice();
            }
            return total;
        }

    }

