package org.application.jetbill.enums.ordenes;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Estado inicial: " + order.getOrder());

        if (order.updateStatus(OrderStatus.PROCESSING)) {
            System.out.println("Orden actualizada a: " + order.getOrder());
        } else {
            System.out.println("No se puede actualizar a: " + OrderStatus.PROCESSING);
        }

        if (order.updateStatus(OrderStatus.DELIVERED)) {
            System.out.println("Orden actualizada a: " + order.getOrder());
        } else {
            System.out.println("No se puede actualizar a: " + order.getOrder());
        }
    }
}
