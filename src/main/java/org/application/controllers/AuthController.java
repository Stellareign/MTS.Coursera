package org.application.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.application.dto.UserRegisterDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.application.service.RegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class AuthController {
    private final RegisterService registerService;

    @PostMapping("/register")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Пользователь зарегистрирован",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserRegisterDTO.class))}
            ),
            @ApiResponse(
                    responseCode = "400", description = "Неверный запрос, пользователь с таким именем уже есть в базе данных"
            ),
    })
    public ResponseEntity<UserRegisterDTO> register(@RequestBody UserRegisterDTO newUser){
        if(registerService.registerUser(newUser)){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        else {
            log.info("Ошибка регистрации!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
