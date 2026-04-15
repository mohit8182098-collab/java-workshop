// Class to demonstrate Method Overloading
class ProductBilling {

    // Method for 1 product
    void bill(double a) {
        System.out.println("Total: " + a);
    }

    // Method for 2 products
    void bill(double a, double b) {
        System.out.println("Total: " + (a + b));
    }

    // Method for 3 products
    void bill(double a, double b, double c) {
        System.out.println("Total: " + (a + b + c));
    }

    public static void main(String[] args) {

        // Create object
        ProductBilling pb = new ProductBilling();

        // Call overloaded methods
        pb.bill(100);
        pb.bill(100, 200);
        pb.bill(100, 200, 300);
    }
}

