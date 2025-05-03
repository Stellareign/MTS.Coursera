package org.application.service;

import org.application.dto.UserRegisterDTO;

public interface UserService {
    boolean saveRegisterUser(UserRegisterDTO userRegisterDTO);
}
