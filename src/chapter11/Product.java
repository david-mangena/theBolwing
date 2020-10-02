package chapter11;

public interface Product {

    double getPrice();
    void setPrice(double getPrice);

    String getName();
    void setName(String getName);

    String getColor();
    void setColor(String getColor);

    default String getBarcode(){
        return "no barcode";
    }
}
