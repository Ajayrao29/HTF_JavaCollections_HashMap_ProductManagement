package org.example;

import java.util.Comparator;

class DiscountDescComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.getDiscountPercentage(),
                p1.getDiscountPercentage());
    }
}
