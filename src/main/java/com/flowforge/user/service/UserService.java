package com.flowforge.user.service;

import com.flowforge.user.dto.request.CreateUserRequest;
import com.flowforge.user.dto.response.UserResponse;
import com.flowforge.user.entity.User;
import com.flowforge.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(CreateUserRequest request) {

        User user = new User(
                request.firstName(),
                request.lastName(),
                request.email(),
                request.active()
        );

        User savedUser = userRepository.save(user);

        return UserResponse.from(savedUser);
    }
}