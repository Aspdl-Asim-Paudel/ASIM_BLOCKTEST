import java.util.ArrayList;
import Models.Item;
import Models.Order;
import Models.User;

public class Main {

    public static void main(String[] args) {
        Item i1 = new Item("T-Shirt", 0032, 21, 12345, "Levis");
        Item i2 = new Item("Pant", 0003, 11, 7845, "Levis");
        Item i3 = new Item("Jacket", 0002, 21, 11945, "Levis");
        Item i4 = new Item("Cap", 001, 21, 32345, "Levis");
        Item i5 = new Item("Hoodie", 0004, 21, 34455, "Levis");



        ArrayList<User> Users = new ArrayList<User>();

        User item = new User(12345, "The retired", 97978897, 122, "Pokhara",Order);

        User u1 = new User(123, "Anim", 986756887, 999, "Kathmandu", Order);
        User u2 = new User(124, "Anime", 975645776, 888, "Pokhara", Order);


        Users.add(u1);
        Users.add(u2);

        ArrayList<Order> Orders = new ArrayList<Order>();

        Order items = new Order(12345, "The retired", 97978897, 122, 11,1,items);

        Order o1 = new Order( 12,"hi",1,9889,11,1,items);
        Order o2 = new Order(124, "Pant", 0003, 7845, 11,1,items);


        Orders.add(o1);
        Orders.add(o2);

        System.out.println(i1.getPrint());
     }

    
        

}
