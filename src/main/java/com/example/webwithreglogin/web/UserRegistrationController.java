package com.example.webwithreglogin.web;


import com.example.webwithreglogin.service.UserService;
import com.example.webwithreglogin.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


//10.
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    // Injected class
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    public String registerUserAccount(@ModelAttribute ("user")UserRegistrationDto registrationDto) {

        userService.save(registrationDto);


        return "redirect:/registration?success";
    }

}

