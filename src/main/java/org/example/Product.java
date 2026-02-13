package org.example;

import java.util.*;

class ProductManager {

    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getPid(), product);
        System.out.println("Product Added: " + product.getPname());
    }

    public void displayProducts() {
        for (Product p : productMap.values()) {
            System.out.println(p);
        }
    }

    // 1️ Cost Asc ( Method Reference )
    public void sortByCostAsc() {
        System.out.println("Sorted by Cost Asc (Method Reference)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(Comparator.comparingDouble(Product::getCost));
        list.forEach(System.out::println);
    }

    // 2️ Cost Desc ( Lambda )
    public void sortByCostDesc() {
        System.out.println("Sorted by Cost Desc (Lambda)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort((p1, p2) -> Double.compare(p2.getCost(), p1.getCost()));
        list.forEach(System.out::println);
    }

    // 3️ Discount Asc ( Anonymous Class )
    public void sortByDiscountAsc() {
        System.out.println("Sorted by Discount Asc (Anonymous Class)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getDiscountPercentage(),
                        p2.getDiscountPercentage());
            }
        });
        list.forEach(System.out::println);
    }

    // 4️ Discount Desc ( Separate Comparator Class )
    public void sortByDiscountDesc() {
        System.out.println("Sorted by Discount Desc (Separate Class)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(new DiscountDescComparator());
        list.forEach(System.out::println);
    }

    // 5 Rating ( Comparable )
    public void sortByRating() {
        System.out.println("Sorted by Rating (Comparable)");
        List<Product> list = new ArrayList<>(productMap.values());
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
