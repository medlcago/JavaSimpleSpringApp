package org.backend.application.controllers;

import lombok.RequiredArgsConstructor;
import org.backend.application.dto.IdRequest;
import org.backend.application.entities.User;
import org.backend.application.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @PostMapping("/")
    public User getUserByIdFromRequestBody(@RequestBody IdRequest idRequest) {
        int userId = idRequest.id();
        return userService.getUser(userId);
    }
}
