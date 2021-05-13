package com.regino.coursework6.config.security.model;

public enum Permission {
    MESSAGES_WRITE("messages:write"),
    MESSAGES_DELETE("messages:delete"),
    CLOTHES_READ("clothes:read"),
    CLOTHES_WRITE("clothes:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
