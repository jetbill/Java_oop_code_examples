package org.application.jetbill.enums.descuento;


//sistema de comercio electrónico donde necesitas aplicar
// diferentes estrategias de descuento basadas en el tipo de cliente.
public enum CustomerType {

    REGULAR {
        @Override
        public double applyDiscount(double amount) {
            return amount * 0.95; // 5% discount
        }
    },
    SILVER {
        @Override
        public double applyDiscount(double amount) {
            return amount * 0.90; // 10% discount
        }
    },
    GOLD {
        @Override
        public double applyDiscount(double amount) {
            return amount * 0.85; // 15% discount
        }
    },
    PLATINUM {
        @Override
        public double applyDiscount(double amount) {
            return amount * 0.80; // 20% discount
        }
    };

    public abstract double applyDiscount(double amount);
}
