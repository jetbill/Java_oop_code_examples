package org.application.jetbill.enums.roles;
import java.util.EnumSet;
import java.util.Set;

//En un sistema de gestión de usuarios, es común tener diferentes roles
// de usuario con permisos específicos. Utilizaremos enums para definir los roles y sus permisos.
public enum UserRole {

    ADMIN(EnumSet.of(Permission.CREATE, Permission.READ, Permission.UPDATE, Permission.DELETE)),
    EDITOR(EnumSet.of(Permission.CREATE, Permission.READ, Permission.UPDATE)),
    VIEWER(EnumSet.of(Permission.READ));

    private final Set<Permission> permissions;

    UserRole(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }
}
