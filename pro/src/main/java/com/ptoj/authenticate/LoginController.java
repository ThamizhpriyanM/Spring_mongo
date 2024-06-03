package com.ptoj.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(HttpSession session) {
        if (session.getAttribute("username") != null) {
            return "redirect:/families";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(UserDTO userDTO, HttpSession session) {
        if (userService.verifyUser(userDTO)) {
            session.setAttribute("username", userDTO.getUsername());
            return "redirect:/families";
        }
        else {
            return "redirect:/login?error";
        }
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String register(UserDTO userDTO) {
        userService.createUser(userDTO);
        return "redirect:/login";
    }
}
