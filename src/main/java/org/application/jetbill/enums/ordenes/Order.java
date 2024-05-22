package org.application.jetbill.enums.ordenes;

public class Order {

    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.PENDING;
    }

    public boolean updateStatus(OrderStatus newStatus) {
        if (status.canTransitionTo(newStatus)) {
            status = newStatus;
            return true;
        }
        return false;
    }

    public OrderStatus getOrder(){
        return this.status;
    }


}
