package org.application.service.mapperFactoring;

import org.application.dto.UserRegisterDTO;
import org.application.entity.User;

public interface UserDTOFactory {
    User createNewUserFromRegisterDto (UserRegisterDTO newUser);
}
