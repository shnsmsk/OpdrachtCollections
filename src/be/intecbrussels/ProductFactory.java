package be.intecbrussels;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter= new ProductSorter();
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int randomNumber = random.nextInt(0, 3);
            if (randomNumber == 0) {
                String name = foodProducts[random.nextInt(0, 5)];
                FoodProduct foodProduct = new FoodProduct(name, random.nextInt(0, 151));
                productSorter.sortProduct(foodProduct);

            } else if (randomNumber == 1) {
                String name = healthProducts[random.nextInt(0, 5)];
                HealthProduct healthProduct = new HealthProduct(name, random.nextInt(0, 151));
                productSorter.sortProduct(healthProduct);
            } else {
                String name = electricProducts[random.nextInt(0, 5)];
                ElectricProduct electricProduct = new ElectricProduct(name, random.nextInt(0, 151));
                productSorter.sortProduct(electricProduct);
            }
        }
    }
}
