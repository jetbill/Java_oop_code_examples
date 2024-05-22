package org.application.jetbill.enums.validacion;
//Supongamos que estás desarrollando una aplicación que necesita validar
//datos de diferentes maneras según el tipo de documento.
public enum DocumentType implements Validator {
    PASSPORT {
        @Override
        public boolean validate(String data) {
            return data.matches("[A-Z0-9]{9}");
        }
    },
    DRIVER_LICENSE {
        @Override
        public boolean validate(String data) {
            return data.matches("[A-Z]{1}\\d{7}");
        }
    },
    SSN {
        @Override
        public boolean validate(String data) {
            return data.matches("\\d{3}-\\d{2}-\\d{4}");
        }
    };

    public static void main(String[] args) {
        String passport = "A12345678";
        String license = "B1234567";
        String ssn = "123-45-6789";

        System.out.println("Passport valid: " + DocumentType.PASSPORT.validate(passport));
        System.out.println("Driver License valid: " + DocumentType.DRIVER_LICENSE.validate(license));
        System.out.println("SSN valid: " + DocumentType.SSN.validate(ssn));
    }
}
