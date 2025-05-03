package org.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.application.dto.UserRegisterDTO;
import org.application.repository.UserRepository;
import org.application.service.mapperFactoring.UserDTOFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserDTOFactory userDTOFactory;


    @Override
    public boolean saveRegisterUser(UserRegisterDTO userRegisterDTO) {
        userRepository.save(userDTOFactory.createNewUserFromRegisterDto(userRegisterDTO));
        return true;
    }
}
