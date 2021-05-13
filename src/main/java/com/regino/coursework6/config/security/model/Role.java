package com.regino.coursework6.config.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.regino.coursework6.config.security.model.Permission.*;

@AllArgsConstructor
@Getter
public enum Role {
    ADMIN(Set.of(MESSAGES_WRITE, MESSAGES_DELETE, CLOTHES_READ, CLOTHES_WRITE)),
    USER(Set.of(MESSAGES_WRITE, CLOTHES_READ));

    private final Set<Permission> permissions;

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
