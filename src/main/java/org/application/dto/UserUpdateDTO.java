package org.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.validation.annotation.Validated;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserUpdateDTO {

    private String login;

@Em
    private String email;


    private String phone;

    private String name;

    private String lastName;

}
