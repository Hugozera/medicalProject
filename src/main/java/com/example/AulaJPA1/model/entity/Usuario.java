package com.example.AulaJPA1.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String senha;

    @ManyToMany
    private List<Role> roles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Adicione sua lógica aqui
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Adicione sua lógica aqui
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Adicione sua lógica aqui
    }

    @Override
    public boolean isEnabled() {
        return true; // Adicione sua lógica aqui
    }
}
