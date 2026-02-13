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
            System.out.println("2. Sort by Cost Asc (Method Reference)");
            System.out.println("3. Sort by Cost Desc (Lambda)");
            System.out.println("4. Sort by Discount Asc (Anonymous Class)");
            System.out.println("5. Sort by Discount Desc (Separate Class)");
            System.out.println("6. Sort by Rating (Comparable)");
            System.out.println("7. Sort by Cost Asc (Streams)");
            System.out.println("8. Sort by Cost Desc (Streams)");
            System.out.println("9. Sort by Discount Asc (Streams)");
            System.out.println("10. Sort by Discount Desc (Streams)");
            System.out.println("11. Sort by Rating (Streams)");
            System.out.println("12. Filter by Name");
            System.out.println("13. Filter by Brand");
            System.out.println("14. Filter by Category");
            System.out.println("15. Filter by Cost Range");
            System.out.println("16. Filter by Name (Streams)");
            System.out.println("17. Filter by Brand (Streams)");
            System.out.println("18. Filter by Category (Streams)");
            System.out.println("19. Filter by Cost Range (Streams)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.displayProducts();
                    break;

                case 2:
                    manager.sortByCostAsc();
                    break;

                case 3:
                    manager.sortByCostDesc();
                    break;

                case 4:
                    manager.sortByDiscountAsc();
                    break;

                case 5:
                    manager.sortByDiscountDesc();
                    break;

                case 6:
                    manager.sortByRating();
                    break;

                case 7:
                    manager.sortByCostAscStreams();
                    break;

                case 8:
                    manager.sortByCostDescStreams();
                    break;

                case 9:
                    manager.sortByDiscountAscStreams();
                    break;

                case 10:
                    manager.sortByDiscountDescStreams();
                    break;

                case 11:
                    manager.sortByRatingStreams();
                    break;

                case 12:
                    System.out.print("Enter product name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    manager.filterByName(name);
                    break;

                case 13:
                    System.out.print("Enter brand: ");
                    sc.nextLine();
                    String brand = sc.nextLine();
                    manager.filterByBrand(brand);
                    break;

                case 14:
                    System.out.print("Enter category: ");
                    sc.nextLine();
                    String category = sc.nextLine();
                    manager.filterByCategory(category);
                    break;

                case 15:
                    System.out.print("Enter min cost: ");
                    double minCost = sc.nextDouble();
                    System.out.print("Enter max cost: ");
                    double maxCost = sc.nextDouble();
                    manager.filterByMinMaxCost(minCost, maxCost);
                    break;

                case 16:
                    System.out.print("Enter product name: ");
                    sc.nextLine();
                    String name2 = sc.nextLine();
                    manager.filterByNameStreams(name2);
                    break;

                case 17:
                    System.out.print("Enter brand: ");
                    sc.nextLine();
                    String brand2 = sc.nextLine();
                    manager.filterByBrandStreams(brand2);
                    break;

                case 18:
                    System.out.print("Enter category: ");
                    sc.nextLine();
                    String category2 = sc.nextLine();
                    manager.filterByCategoryStreams(category2);
                    break;

                case 19:
                    System.out.print("Enter min cost: ");
                    double minCost2 = sc.nextDouble();
                    System.out.print("Enter max cost: ");
                    double maxCost2 = sc.nextDouble();
                    manager.filterByMinMaxCostStreams(minCost2, maxCost2);
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

