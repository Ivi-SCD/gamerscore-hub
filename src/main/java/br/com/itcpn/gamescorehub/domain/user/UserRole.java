package br.com.itcpn.gamescorehub.domain.user;

import lombok.Getter;

@Getter
public enum UserRole {
    DEVELOPER("dev"),
    USER("user");

    private final String role;
    UserRole(String role) {
        this.role = role;
    }

}
