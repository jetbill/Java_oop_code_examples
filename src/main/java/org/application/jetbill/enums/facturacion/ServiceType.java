package org.application.jetbill.enums.facturacion;
//Estrategia de Cálculo de Tarifas en un Sistema de Facturación
public enum ServiceType {

    STANDARD {
        @Override
        public double calculateCharge(int units) {
            return units * 1.5;
        }
    },
    PREMIUM {
        @Override
        public double calculateCharge(int units) {
            return units * 2.5;
        }
    },
    ENTERPRISE {
        @Override
        public double calculateCharge(int units) {
            if (units <= 100) {
                return units * 2.0;
            } else {
                return (100 * 2.0) + ((units - 100) * 1.8);
            }
        }
    };

    public abstract double calculateCharge(int units);
}
