package Models;

public class Item {
    String name;
    int item_code;
    int item_available;
    int price;
    String brand;

    String print;
    public Item(String name, int item_code, int item_available, int price, String brand) {
        this.name = name;
        this.item_code = item_code;
        this.item_available = item_available;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public int getItem_available() {
        return item_available;
    }

    public void setItem_available(int item_available) {
        this.item_available = item_available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getPrint() {
        this.print = "Item Name : "+getName()+"\n Code : "+getItem_code()+"Brand : "+this.brand+"\n Price : "+this.price;
        return print;
    }
    public String setPrint(String print) {
        this.print = " Item Name : "+getName()+"\n\n Code : "+getItem_code()+"\n\n Brand : "+this.brand+"\n\n Price : "+this.price;
        return print;
    }


}

