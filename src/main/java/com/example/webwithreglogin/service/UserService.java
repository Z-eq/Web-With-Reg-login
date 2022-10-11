package com.example.webwithreglogin.service;

import com.example.webwithreglogin.model.User;
import com.example.webwithreglogin.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}
