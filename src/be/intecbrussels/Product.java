package be.intecbrussels;

public class Product {
    private String name;
    private int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }

    public int getProductId() {
        return productId;
    }
}
