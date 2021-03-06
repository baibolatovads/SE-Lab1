package com.company;

import java.util.ArrayList;
import java.util.List;

public class Store extends UserActions{
    String name, id;
    ArrayList<Customer> customers;
    ArrayList<Item> items;
    ArrayList<Observer> observers;
    ArrayList<Store> stores;


    public Store() {}

    public Store(String name){
        this.name= name;
    }



    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        customers.remove(c);
    }

    public List<Customer> customers(){
        return this.customers;
    }

    public List<Item> items(){
        return this.items;
    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public String toString(){
        return this.name;
    }

}

