package org.application.jetbill.enums.roles;

public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public boolean canPerform(Permission permission) {
        return role.hasPermission(permission);
    }
}
