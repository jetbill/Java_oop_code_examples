package org.application.jetbill.enums.ordenes;


//Supongamos que estás desarrollando un sistema de gestión
//de órdenes de compra, y necesitas manejar diferentes estados de una orden.
public enum OrderStatus {

    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean canTransitionTo(OrderStatus newStatus) {
        switch (this) {
            case PENDING:
                return newStatus == PROCESSING || newStatus == CANCELLED;
            case PROCESSING:
                return newStatus == SHIPPED || newStatus == CANCELLED;
            case SHIPPED:
                return newStatus == DELIVERED;
            case DELIVERED:
                return false;
            case CANCELLED:
                return false;
            default:
                throw new IllegalArgumentException("Unknown status: " + this);
        }
    }
}
