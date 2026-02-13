package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "Shoes", 1200,
                "Nike", "Footwear", 5, 10));

        manager.addProduct(new Product(2, "Jeans", 1000,
                "Levi's", "Clothing", 4, 15));

        manager.addProduct(new Product(3, "Vacuum Cleaner", 5000,
                "Philips", "Appliances", 4, 20));

        manager.addProduct(new Product(4, "Bat", 2000,
                "Puma", "Sports", 4, 18));

        manager.addProduct(new Product(5, "Chair", 2500,
                "IKEA", "Furniture", 5, 12));

        manager.addProduct(new Product(6, "Laptop", 90000,
                "Apple", "Laptop", 5, 8));

        manager.addProduct(new Product(7, "TV", 30000,
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
            System.out.println("7. Filter by Name");
            System.out.println("8. Filter by Brand");
            System.out.println("9. Filter by Category");
            System.out.println("10. Filter by Cost Range");
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

                case 7:
                    System.out.print("Enter product name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    manager.filterByName(name);
                    break;

                case 8:
                    System.out.print("Enter brand: ");
                    sc.nextLine();
                    String brand = sc.nextLine();
                    manager.filterByBrand(brand);
                    break;

                case 9:
                    System.out.print("Enter category: ");
                    sc.nextLine();
                    String category = sc.nextLine();
                    manager.filterByCategory(category);
                    break;

                case 10:
                    System.out.print("Enter min cost: ");
                    double minCost = sc.nextDouble();
                    System.out.print("Enter max cost: ");
                    double maxCost = sc.nextDouble();
                    manager.filterByMinMaxCost(minCost, maxCost);
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


