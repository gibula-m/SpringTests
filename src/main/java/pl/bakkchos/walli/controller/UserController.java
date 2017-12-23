package pl.bakkchos.walli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.bakkchos.walli.data.UserEntity;
import pl.bakkchos.walli.dto.UserDTO;
import pl.bakkchos.walli.service.UserConverter;
import pl.bakkchos.walli.data.UserRepository;

@RestController
public class UserController {
    @Autowired
    UserRepository ur;
    @Autowired
    UserConverter uc;

    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/user/{username}")
    public @ResponseBody
    UserDTO getUser(@PathVariable String username) {

        return uc.convert(ur.findByUsername(username));
    }
    @RequestMapping("/user/add")
    public void addUser(@RequestBody UserEntity user) {
    ur.save(user);

    }
}