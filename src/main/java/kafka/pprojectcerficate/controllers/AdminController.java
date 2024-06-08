package kafka.pprojectcerficate.controllers;

import kafka.pprojectcerficate.dtos.UserDTO;
import kafka.pprojectcerficate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.findAll();
    }
}

