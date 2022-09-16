package be.intecbrussels;

public class App {
    public static void main(String[] args) {
        ProductSorter productSorter=new ProductSorter();
        ProductFactory productFactory=new ProductFactory(productSorter);
        productFactory.createProducts(100);
        System.out.println("*".repeat(100));
        System.out.println(productSorter.getElectricProducts());
        System.out.println("*".repeat(100));
        System.out.println(productSorter.getFoodProducts());
        System.out.println("*".repeat(100));
        System.out.println(productSorter.getHealthProducts());
        System.out.println("Number of Products : "+productSorter.getNumberOfProducts());
    }
}
