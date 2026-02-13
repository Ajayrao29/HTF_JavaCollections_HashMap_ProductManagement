package org.example;

class Product implements Comparable<Product> {

    private int pid;
    private String pname;
    private double cost;
    private String brand;
    private String category;
    private int rating;
    private double discountPercentage;

    public Product(int pid, String pname, double cost, String brand,
                   String category, int rating, double discountPercentage) {
        this.pid = pid;
        this.pname = pname;
        this.cost = cost;
        this.brand = brand;
        this.category = category;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
    }

    public int getPid() { return pid; }
    public String getPname() { return pname; }
    public double getCost() { return cost; }
    public String getBrand() { return brand; }
    public String getCategory() { return category; }
    public int getRating() { return rating; }
    public double getDiscountPercentage() { return discountPercentage; }

    // Natural ordering → Rating descending
    @Override
    public int compareTo(Product other) {
        return Integer.compare(other.rating, this.rating);
    }

    @Override
    public String toString() {
        return pid + " | " + pname + " | " + cost + " | " +
                brand + " | " + category + " | " +
                rating + " | " + discountPercentage;
    }
}
