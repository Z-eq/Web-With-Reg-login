package com.example.webwithreglogin.service;

import com.example.webwithreglogin.model.Role;
import com.example.webwithreglogin.model.User;
import com.example.webwithreglogin.repository.UserRepository;
import com.example.webwithreglogin.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
       // super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {

        User user = new User(registrationDto.getFistName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);


    }
}
