package Project.HungerBox;

import java.util.ArrayList;

// Interface for menu items
interface Orderable {
    double getPrice();
    String getDescription();
    void prepare();
}

// Interface for discounts
interface Discounts {
    double applyDiscounts(double discount);
}

// Abstract class
abstract class MenuItems implements Orderable, Discounts {

    private final String name;
    private double price;
    private String category;

    static int totalOrders = 0;

    public MenuItems(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String getDescription() {
        return "Item Name : " + name +
                " | Category : " + category +
                " | Price : ₹" + price;
    }

    @Override
    public abstract void prepare();

    @Override
    public double applyDiscounts(double discount) {
        return price - (price * discount / 100);
    }
}

// Veg Items
class VegItems extends MenuItems {

    private boolean isJain;

    public VegItems(String name, double price) {
        super(name, price, "Veg");
        this.isJain = false;
    }

    public VegItems(String name, double price, boolean isJain) {
        super(name, price, "Veg");
        this.isJain = isJain;
    }

    @Override
    public void prepare() {
        System.out.println(getName() + " is being prepared.");
        totalOrders++;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                (isJain ? " (Jain)" : "");
    }
}

// Non Veg Items
class NonVegItems extends MenuItems {

    private String meatType;

    public NonVegItems(String name,
                       double price,
                       String category,
                       String meatType) {

        super(name, price, category);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println(getName() + " is being prepared.");
        totalOrders++;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " | Meat Type : " + meatType;
    }
}

// Order Class
class Orders {

    private final int orderId;
    private static int orderCount = 0;

    private final String customerName;
    private ArrayList<MenuItems> items;

    private String status;

    public Orders(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.status = "Order Placed";
        this.orderId = ++orderCount;
    }

    public void addItem(MenuItems item) {
        items.add(item);

        System.out.println(
                item.getName() +
                        " added to order."
        );
    }

    public void prepareOrder() {

        status = "Preparing";

        for (MenuItems item : items) {
            item.prepare();
        }

        status = "Ready";
    }

    public double calculatePrice() {

        double total = 0;

        for (MenuItems item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void generateBill(double discountPercent) {

        double subtotal = calculatePrice();

        double discounted =
                subtotal -
                        (subtotal * discountPercent / 100);

        double tax = discounted * 0.05;

        double total = discounted + tax;

        System.out.println("\n========== BILL ==========");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + customerName);
        System.out.println("Status   : " + status);

        System.out.println("\nItems:");

        for (MenuItems item : items) {
            System.out.println(
                    item.getName() +
                            " - ₹" +
                            item.getPrice()
            );
        }

        System.out.println("--------------------------");
        System.out.println("Subtotal : ₹" + subtotal);
        System.out.println("Discount : " + discountPercent + "%");
        System.out.println("GST (5%) : ₹" + tax);
        System.out.println("Total    : ₹" + total);
        System.out.println("==========================");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }
}

// Restaurant Class
class Res {

    private String name;

    private ArrayList<MenuItems> menu;
    private ArrayList<Orders> orders;

    public Res(String name) {

        this.name = name;

        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenu(MenuItems item) {
        menu.add(item);
    }

    public void showMenu() {

        System.out.println("\n----- MENU -----");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                            menu.get(i).getDescription()
            );
        }
    }

    public Orders placeOrder(String customerName) {

        Orders order =
                new Orders(customerName);

        orders.add(order);

        return order;
    }

    public MenuItems getItem(int index) {
        return menu.get(index);
    }

    public void showOrders() {

        System.out.println("\n----- ORDERS -----");

        for (Orders order : orders) {

            System.out.println(
                    "Order ID : " +
                            order.getOrderId() +
                            " | Customer : " +
                            order.getCustomerName() +
                            " | Status : " +
                            order.getStatus()
            );
        }
    }
}

// Main Class
public class Hungerbox {

    public static void main(String[] args) {

        Res res = new Res("Spicy Garden");

        // Add Menu
        res.addMenu(
                new VegItems(
                        "Paneer Butter Masala",
                        300));

        res.addMenu(
                new VegItems(
                        "Soya Butter Masala",
                        200));

        res.addMenu(
                new VegItems(
                        "Tofu Butter Masala",
                        150));

        res.addMenu(
                new VegItems(
                        "Jain Paneer Butter Masala",
                        350,
                        true));

        res.addMenu(
                new VegItems(
                        "Peanut Butter Masala",
                        250));

        res.addMenu(
                new NonVegItems(
                        "Chicken Butter Masala",
                        400,
                        "Non Veg",
                        "Chicken"));

        // Display Menu
        res.showMenu();

        // Place Order
        Orders order =
                res.placeOrder("Rahul");

        order.addItem(res.getItem(0));
        order.addItem(res.getItem(5));

        // Prepare Order
        order.prepareOrder();

        // Generate Bill
        order.generateBill(10);

        // Show Orders
        res.showOrders();
    }
}