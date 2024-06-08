package kafka.pprojectcerficate.controllers;

import kafka.pprojectcerficate.dtos.UserDTO;
import kafka.pprojectcerficate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public Optional<UserDTO> getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/id/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }
}

