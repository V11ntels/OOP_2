public class Product {
    private ExpiryDate expiryDate;
    private ProductType productType;
    private Quantity quantity;
    private double price;
    private String name;

    public Product(ExpiryDate expiryDate, ProductType productType, Quantity quantity, double price, String name) {
        this.expiryDate = expiryDate;
        this.productType = productType;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }
    public ExpiryDate getExpiryDate() {
        return this.expiryDate;
    }
    public String getName() {
        return this.name;
    }
}
