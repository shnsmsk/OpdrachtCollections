package be.intecbrussels;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    private List<Product> products = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();
    private List<HealthProduct> healthProducts = new ArrayList<>();

    private int productCount;

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public int getNumberOfProducts() {
        return productCount;
    }


    public void sortProduct(Product product) {
        boolean check = true;
        for (int i = 0; i < products.size(); i++) {
            if (product.getProductId() == products.get(i).getProductId()) {
                check = false;
            }
        }
        if (check) {
            products.add(product);
            if (product instanceof FoodProduct) {
                foodProducts.add((FoodProduct) product);
            } else if (product instanceof HealthProduct) {
                healthProducts.add((HealthProduct) product);
            } else {
                electricProducts.add((ElectricProduct) product);
            }
            productCount++;
        }
    }
}
