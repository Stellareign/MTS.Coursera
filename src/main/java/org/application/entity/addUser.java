package org.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity
public class addUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Size(min = 3, max = 10, message = "Логин должен содержать не менее трёх и не более десяти символов")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Логин может содержать только латинские символы и цифры")
    public String login
            ;
    @Size(min = 8, message = "Пароль должен содержать не менее восьми символов")
    public String password;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Неверный формат email")
    public String email;

    @Pattern(regexp = "\\+7\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}", message = "Неверный формат номера телефона")
    public String phone;
}
