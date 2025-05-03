package org.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.application.dto.UserRegisterDTO;
import org.application.repository.UserRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository userRepository;
    private final UserService userService;

    @Override
    public boolean registerUser(UserRegisterDTO userRegisterDTO) {
        if (userRepository.findByName(userRegisterDTO.getName()) != null) {
            return false;
        }
        return userService.saveRegisterUser(userRegisterDTO);
    }
}
