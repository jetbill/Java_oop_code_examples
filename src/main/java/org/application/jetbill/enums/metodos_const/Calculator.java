package org.application.jetbill.enums.metodos_const;

public class Calculator {

    public static void main(String[] args) {
        double x = 10;
        double y = 2;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
