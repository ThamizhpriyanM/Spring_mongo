package com.ptoj.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void createUser(UserDTO userDTO) {
        User newUser = new User(userDTO.getUsername(), userDTO.getPassword());
        userRepository.save(newUser);
    }
    public boolean verifyUser(UserDTO userDTO) {
        User user = userRepository.findByUsername(userDTO.getUsername());
        return user != null && user.getPassword().equals(userDTO.getPassword());
    }
}
