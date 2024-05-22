package org.application.jetbill.enums.metodos_const;
//Los enums pueden tener métodos y constructores como cualquier otra clase. Esto es útil
//cuando necesitas asociar datos adicionales con cada constante de enum.
public enum Operation {
    ADDITION("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION("/") {
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

    public abstract double apply(double x, double y);
}
