package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.example.enums.Group;
import org.example.enums.Role;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int id;

    @Size(min = 3, max = 10, message = "Логин должен содержать не менее трёх и не более десяти символов")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Логин может содержать только латинские символы и цифры")
    private String login;

    @Size(min = 8, message = "Пароль должен содержать не менее восьми символов")
    private String password;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Неверный формат email")
    private String email;

    @Pattern(regexp = "\\+7\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}", message = "Неверный формат номера телефона")
    private String phone;

    private LocalDate registrationDate;
    private Role role;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private String name;

    private String lastName;

    private String dateAndNameOfUpdater;
    private String dateAndNameOfDeleter;

    //*********** необязательные поля******
    private int rate;
    private Group group;
    private String socialNetwork;

    //********************* конструкторы *****************************

    public User(String login, String password, String email, String phone, String name, String lastName) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * новый юзер
     */

    //****************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
