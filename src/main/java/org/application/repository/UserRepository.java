package org.application.repository;

import org.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String username);

    User findUserById(int id);

    User findByEmail(String email);

    User findByPhone(String phone);
}
