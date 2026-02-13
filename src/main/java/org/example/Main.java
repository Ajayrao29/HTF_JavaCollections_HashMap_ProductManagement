package org.example;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "iPhone 15", 1200,
                "Apple", "Mobile", 5, 10));

        manager.addProduct(new Product(2, "Galaxy S23", 1000,
                "Samsung", "Mobile", 4, 15));

        manager.addProduct(new Product(3, "MacBook Air", 1500,
                "Apple", "Laptop", 5, 20));

        manager.addProduct(new Product(4, "Sony Headphones", 300,
                "Sony", "Accessories", 3, 25));

        System.out.println("\n------- Original List ------");
        manager.displayProducts();

        System.out.println("\n------ Cost Asc -------");
        manager.sortByCostAsc();
        manager.displayProducts();

        System.out.println("\n------ Cost Desc ------");
        manager.sortByCostDesc();
        manager.displayProducts();

        System.out.println("\n------- Discount Asc -------");
        manager.sortByDiscountAsc();
        manager.displayProducts();

        System.out.println("\n------- Discount Desc -------");
        manager.sortByDiscountDesc();
        manager.displayProducts();

        System.out.println("\n------- Rating --------");
        manager.sortByRating();
        manager.displayProducts();
    }
}
