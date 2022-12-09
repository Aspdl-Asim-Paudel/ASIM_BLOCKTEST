package Models;

import java.sql.Array;

public class Order {

    int user_id;

    String item_name;
    int item_code;

    int price;

    int quantity;

    Array Item;

    public Order(int user_id, String item_name, int item_code, int price, int quantity, Array item) {
        this.user_id = user_id;
        this.item_name = item_name;
        this.item_code = item_code;
        this.price = price;
        this.quantity = quantity;
        Item = item;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Array getItem() {
        return Item;
    }

    public void setItem(Array item) {
        Item = item;
    }
}

