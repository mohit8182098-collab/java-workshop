// Product class encapsulation dikhane ke liye
class Product {

    // Private variables (direct access allowed nahi hai)
    private int productId;
    private String productName;
    private double price;

    // Setter method values set karne ke liye
    void setProduct(int id, String name, double price) {
        productId = id;        // id assign
        productName = name;    // name assign
        this.price = price;    // price assign (this keyword use)
    }

    // Getter method values access karne ke liye
    void getProduct() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Object create
        Product p = new Product();

        // Setter method se values set
        p.setProduct(250, "Laptop", 68200);

        // Getter method se values print
        p.getProduct();
    }
}
