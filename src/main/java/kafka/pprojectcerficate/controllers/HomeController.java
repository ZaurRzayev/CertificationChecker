package kafka.pprojectcerficate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/tool/register")
    public String toolRegister() {
        return "tool_register";
    }

    @GetMapping("/tool/edit")
    public String toolEdit() {
        return "tool_edit";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}

