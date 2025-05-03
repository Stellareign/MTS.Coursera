package org.application.service;

import org.application.dto.UserRegisterDTO;

public interface RegisterService {
    boolean registerUser(UserRegisterDTO userRegisterDTO);
}
