package org.application.jetbill.enums.mapeo;
//En sistemas empresariales, a menudo necesitas mapear enums a valores de base de datos
//y viceversa. Aquí mostramos cómo hacerlo usando un enum con un código de base de datos.
public enum Status {
    NEW(1),
    IN_PROGRESS(2),
    COMPLETED(3),
    CLOSED(4);

    private final int dbCode;

    Status(int dbCode) {
        this.dbCode = dbCode;
    }

    public int getDbCode() {
        return dbCode;
    }

    public static Status fromDbCode(int dbCode) {
        for (Status status : Status.values()) {
            if (status.getDbCode() == dbCode) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown database code: " + dbCode);
    }
    public static void main(String[] args) {
        int dbCode = 2;
        Status status = Status.fromDbCode(dbCode);
        System.out.println("Status for code " + dbCode + " is " + status);
    }
}
