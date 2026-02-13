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
    // Sort Code: Uses Comparator.comparingDouble with method reference
    public void sortByCostAsc() {
        System.out.println("Sorted by Cost Asc (Method Reference)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(Comparator.comparingDouble(Product::getCost));
        list.forEach(System.out::println);
    }

    // 2️ Cost Desc ( Lambda )
    // Sort Code: Uses lambda expression with Double.compare for descending order
    public void sortByCostDesc() {
        System.out.println("Sorted by Cost Desc (Lambda)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort((p1, p2) -> Double.compare(p2.getCost(), p1.getCost()));
        list.forEach(System.out::println);
    }

    // 3️ Discount Asc ( Anonymous Class )
    // Sort Code: Uses anonymous inner class implementing Comparator interface
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
    // Sort Code: Uses external DiscountDescComparator class
    public void sortByDiscountDesc() {
        System.out.println("Sorted by Discount Desc (Separate Class)");
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(new DiscountDescComparator());
        list.forEach(System.out::println);
    }

    // 5 Rating ( Comparable )
    // Sort Code: Uses Collections.sort with Comparable interface implemented in Product class
    public void sortByRating() {
        System.out.println("Sorted by Rating (Comparable)");
        List<Product> list = new ArrayList<>(productMap.values());
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    // STREAM-BASED SORTING METHODS

    // 6️ Cost Asc ( Streams )
    public void sortByCostAscStreams() {
        System.out.println("Sorted by Cost Asc (Streams)");
        productMap.values().stream()
                .sorted(Comparator.comparingDouble(Product::getCost))
                .forEach(System.out::println);
    }

    // 7️ Cost Desc ( Streams )
    public void sortByCostDescStreams() {
        System.out.println("Sorted by Cost Desc (Streams)");
        productMap.values().stream()
                .sorted((p1, p2) -> Double.compare(p2.getCost(), p1.getCost()))
                .forEach(System.out::println);
    }

    // 8️ Discount Asc ( Streams )
    public void sortByDiscountAscStreams() {
        System.out.println("Sorted by Discount Asc (Streams)");
        productMap.values().stream()
                .sorted(Comparator.comparingDouble(Product::getDiscountPercentage))
                .forEach(System.out::println);
    }

    // 9️ Discount Desc ( Streams )
    public void sortByDiscountDescStreams() {
        System.out.println("Sorted by Discount Desc (Streams)");
        productMap.values().stream()
                .sorted((p1, p2) -> Double.compare(p2.getDiscountPercentage(), p1.getDiscountPercentage()))
                .forEach(System.out::println);
    }

    // 🔟 Rating ( Streams )
    public void sortByRatingStreams() {
        System.out.println("Sorted by Rating (Streams)");
        productMap.values().stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void filterByName(String name) {
        System.out.println("Filtered by Name: " + name);
        for (Product p : productMap.values()) {
            if (p.getPname().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    public void filterByBrand(String brand) {
        System.out.println("Filtered by Brand: " + brand);
        for (Product p : productMap.values()) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(p);
            }
        }
    }

    //filterByBrand using streams
    public void filterByBrandStreams(String brand) {
        System.out.println("Filtered by Brand (Streams): " + brand);
        productMap.values().stream()
                .filter(p -> p.getBrand().equals(brand))
                .forEach(System.out::println);
    }


    public void filterByCategory(String category) {
        System.out.println("Filtered by Category: " + category);
        for (Product p : productMap.values()) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                System.out.println(p);
            }
        }
    }

    public void filterByMinMaxCost(double minCost, double maxCost) {
        System.out.println("Filtered by Cost Range: " + minCost + " - " + maxCost);
        for (Product p : productMap.values()) {
            if (p.getCost() >= minCost && p.getCost() <= maxCost) {
                System.out.println(p);
            }
        }
    }

    // STREAM-BASED FILTER METHODS

    public void filterByNameStreams(String name) {
        System.out.println("Filtered by Name (Streams): " + name);
        productMap.values().stream()
                .filter(p -> p.getPname().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    public void filterByCategoryStreams(String category) {
        System.out.println("Filtered by Category (Streams): " + category);
        productMap.values().stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .forEach(System.out::println);
    }

    public void filterByMinMaxCostStreams(double minCost, double maxCost) {
        System.out.println("Filtered by Cost Range (Streams): " + minCost + " - " + maxCost);
        productMap.values().stream()
                .filter(p -> p.getCost() >= minCost && p.getCost() <= maxCost)
                .forEach(System.out::println);
    }
}

