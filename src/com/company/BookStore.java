package com.company;

public class BookStore extends Store {
    public BookStore() { }

    public BookStore(String name){
        super(name);
        this.id = "11111";
        this.items = new ArrayList<Item>();
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String listItems(){
        String output = "";
        Iterator it = this.items.iterator();
        while(it.hasNext()){
            Item current = (Item)it.next();
            String pattern = "Book Store " + this.name + ". " + current;
            pattern += '\n';
            output += pattern;
        }

        return output;
    }
}
