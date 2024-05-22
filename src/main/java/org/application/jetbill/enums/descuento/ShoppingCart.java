package org.application.jetbill.enums.descuento;

public class ShoppingCart {

    private double totalAmount;
    private CustomerType customerType;

    public ShoppingCart(double totalAmount, CustomerType customerType) {
        this.totalAmount = totalAmount;
        this.customerType = customerType;
    }

    public double getTotalAmountAfterDiscount() {
        return customerType.applyDiscount(totalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(200.0, CustomerType.REGULAR);
        ShoppingCart cart2 = new ShoppingCart(200.0, CustomerType.GOLD);

        System.out.println("Total after discount for REGULAR customer: " + cart1.getTotalAmountAfterDiscount());
        System.out.println("Total after discount for GOLD customer: " + cart2.getTotalAmountAfterDiscount());
    }
}
