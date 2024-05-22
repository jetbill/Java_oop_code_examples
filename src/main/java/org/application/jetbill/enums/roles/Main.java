package org.application.jetbill.enums.roles;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Alice", UserRole.ADMIN);
        User editor = new User("Bob", UserRole.EDITOR);
        User viewer = new User("Charlie", UserRole.VIEWER);

        System.out.println("¿Admin puede borrar? " + admin.canPerform(Permission.DELETE));
        System.out.println("¿Editor puede borrar? " + editor.canPerform(Permission.DELETE));
        System.out.println("¿Viewer puede leer? " + viewer.canPerform(Permission.READ));
    }
}
