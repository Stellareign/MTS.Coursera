package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * Регистрация пользователя
 */
public class UserRegisterDTO {
    private String login;
    private String password;
    private String email;
    private String phone;
    private String name;
    private String surname;

}
