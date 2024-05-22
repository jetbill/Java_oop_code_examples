package org.application.jetbill.enums.facturacion;

public class BillingSystem {
    public double generateInvoice(ServiceType serviceType, int units) {
        return serviceType.calculateCharge(units);
    }

    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        System.out.println("Standard service charge for 50 units: " + billingSystem.generateInvoice(ServiceType.STANDARD, 50));
        System.out.println("Premium service charge for 50 units: " + billingSystem.generateInvoice(ServiceType.PREMIUM, 50));
        System.out.println("Enterprise service charge for 150 units: " + billingSystem.generateInvoice(ServiceType.ENTERPRISE, 150));
    }
}
