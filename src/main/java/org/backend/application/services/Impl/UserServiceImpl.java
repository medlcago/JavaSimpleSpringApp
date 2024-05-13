package org.backend.application.services.Impl;

import lombok.RequiredArgsConstructor;
import org.backend.application.entities.User;
import org.backend.application.repository.UserRepository;
import org.backend.application.services.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
