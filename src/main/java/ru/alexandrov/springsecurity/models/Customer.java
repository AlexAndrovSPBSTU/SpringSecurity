package ru.alexandrov.springsecurity.models;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pwd")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return password;
    }

    public void setPwd(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
