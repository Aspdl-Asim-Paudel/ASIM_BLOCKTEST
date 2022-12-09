package Models;

import java.sql.Array;
import java.util.ArrayList;

public class User {
    int user_id;
    String user_name;

    int contact;;

    int user_code;

    String address;

    Array Order;

    public User(int user_id, String user_name, int contact, int user_code, String address, Array order) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.contact = contact;
        this.user_code = user_code;
        this.address = address;
        Order = order;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getUser_code() {
        return user_code;
    }

    public void setUser_code(int user_code) {
        this.user_code = user_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Array getOrder() {
        return Order;
    }

    public void setOrder(Array order) {
        Order = order;
    }
}
