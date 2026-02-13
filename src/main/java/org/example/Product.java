package org.example;

import java.util.*;

class ProductManager {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product Added: " + product.getPname());
    }

    public void displayProducts() {
        productList.forEach(System.out::println);
    }

    // 1️⃣ Cost Asc → Method Reference
    public void sortByCostAsc() {
        System.out.println("Sorted by Cost Asc (Method Reference)");
        productList.sort(Comparator.comparingDouble(Product::getCost));
    }

    // 2️⃣ Cost Desc → Lambda
    public void sortByCostDesc() {
        System.out.println("Sorted by Cost Desc (Lambda)");
        productList.sort((p1, p2) ->
                Double.compare(p2.getCost(), p1.getCost()));
    }

    // 3️⃣ Discount Asc → Anonymous Class
    public void sortByDiscountAsc() {
        System.out.println("Sorted by Discount Asc (Anonymous Class)");
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getDiscountPercentage(),
                        p2.getDiscountPercentage());
            }
        });
    }

    // 4️⃣ Discount Desc → Separate Comparator Class
    public void sortByDiscountDesc() {
        System.out.println("Sorted by Discount Desc (Separate Class)");
        productList.sort(new DiscountDescComparator());
    }

    // 5️⃣ Rating → Comparable
    public void sortByRating() {
        System.out.println("Sorted by Rating (Comparable)");
        Collections.sort(productList);
    }
}
