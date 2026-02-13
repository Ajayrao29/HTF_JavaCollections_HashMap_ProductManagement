package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "Shoes", 1200,
                "Nike", "Footwear", 5, 10));

        manager.addProduct(new Product(2, "Jeans", 1000,
                "Levi's", "Clothing", 4, 15));

        manager.addProduct(new Product(3, "Vaccum Cleaner", 5000,
                "Philips", "Appliances", 4, 20));

        manager.addProduct(new Product(4, "Shirts", 35,
                "Decathlon", "Sports", 4, 18));

        manager.addProduct(new Product(5, "Chair", 250,
                "IKEA", "Furniture", 5, 12));

        manager.addProduct(new Product(6, "Laptop", 1500,
                "Apple", "Laptop", 5, 8));

        manager.addProduct(new Product(7, "TV", 300,
                "Sony", "Accessories", 4, 25));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------------- MENU --------------");
            System.out.println("1. Display Products");
            System.out.println("2. Sort by Cost Asc");
            System.out.println("3. Sort by Cost Desc");
            System.out.println("4. Sort by Discount Asc");
            System.out.println("5. Sort by Discount Desc");
            System.out.println("6. Sort by Rating");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.displayProducts();
                    break;

                case 2:
                    manager.sortByCostAsc();
                    manager.displayProducts();
                    break;

                case 3:
                    manager.sortByCostDesc();
                    manager.displayProducts();
                    break;

                case 4:
                    manager.sortByDiscountAsc();
                    manager.displayProducts();
                    break;

                case 5:
                    manager.sortByDiscountDesc();
                    manager.displayProducts();
                    break;

                case 6:
                    manager.sortByRating();
                    manager.displayProducts();
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}


