package com.company;

import java.util.Scanner;

public class Customer {
    ShoppingCart shoppingCart;
    String name;
    Store store;

    public Customer () {}

    public Customer(String name, String store){
        this.name = name;
        if(store.equals("Book")) this.store = Main.books;
        if(store.equals("Shoes")) this.store = Main.nike;
        if(store.equals("Game")) this.store = Main.gameOver;

    }

    public ShoppingCart getShoppingCart(){
        return Mall.getShoppingCart();
    }

    public void changeStore(){
        System.out.println("Stores: ");
        for(int i = 0; i < Main.store.stores.size(); i++){
            System.out.println(i + 1 + ". " + Main.store.stores.get(i));
        }

        System.out.println("Choose number: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        this.store = Main.store.stores.get(index - 1);
    }

    public String toString(){
        return "Name " + this.name + ". Store" + this.store;
    }
}
