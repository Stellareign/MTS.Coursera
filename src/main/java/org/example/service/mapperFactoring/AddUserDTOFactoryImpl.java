package org.example.service.mapperFactoring;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserRegisterDTO;
import org.example.entity.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddUserDTOFactoryImpl implements UserDTOFactoy {
    /**
     * Создание нового юзера
     * @param newUser
     * @return User
     */
    public User addNewUserFromDTO(UserRegisterDTO newUser){
        return new User (newUser.getLogin(), newUser.getPassword(), newUser.getPassword(),
                newUser.getPhone(), newUser.getName(), newUser.getSurname());
    }
}
