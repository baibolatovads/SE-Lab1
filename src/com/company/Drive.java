package com.company;

public class Drive {

    public static Store store = new Store();
    public static BookStore books = new BookStore("Books.com");
    public static ShoeStore nike = new ShoeStore("Nike.com");
    public static GameStore gameOver = new GameStore("GameOver.com");

    public static void main(String[] args) {
        // write your code here
        Data d = new Data();
        Mall myMall = new Mall("My Mall");
        ArrayList<Item> dataItems  = d.splitItems("C:\\Users\\User_PC\\Desktop\\SE Lab1\\src\\com\\company\\items.txt");
        store.stores.add(books);
        store.stores.add(nike);
        store.stores.add(gameOver);


        Customer c = new Customer("Karzhas", "Book");

        System.out.println(c.store);




    }
}
