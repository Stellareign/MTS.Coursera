package org.application.service.mapperFactoring;

import lombok.RequiredArgsConstructor;
import org.application.dto.UserRegisterDTO;
import org.application.entity.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddUserDTOFactoryImpl implements UserDTOFactory {
    /**
     * Создание нового юзера
     * @param newUser
     * @return User
     */
    @Override
    public User createNewUserFromRegisterDto (UserRegisterDTO newUser){
        return new User (newUser.getLogin(), newUser.getPassword(), newUser.getPassword(),
                newUser.getPhone(), newUser.getName(), newUser.getSurname());
    }
}
