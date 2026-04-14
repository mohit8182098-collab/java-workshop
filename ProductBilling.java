public class ProductBilling {


    void bill(int price){
        System.out.println("tOTAL bILL FOR 1 PRODUCT IS : "+price);

    }

    void bill(int pricel, int price2){
        System.out.println("tOTAL bILL FOR 2 PRODUCT IS : "+(pricel+price2));

    }
    void bill(int pricel, int price2, int price3){
        System.out.println("tOTAL bILL FOR 3 PRODUCT IS : "+(pricel+price2+price3));

    }
    public static void main(String[] args){
        ProductBilling pb = new ProductBilling();
        pb.bill(100);
        pb.bill(100, 200);
        pb.bill(100, 200, 300);
    }
    
}
