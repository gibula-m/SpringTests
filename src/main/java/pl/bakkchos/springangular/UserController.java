package pl.bakkchos.springangular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bakkchos.springangular.data.UserConverter;
import pl.bakkchos.springangular.data.UserEntity;
import pl.bakkchos.springangular.data.UserRepository;

@RestController
public class UserController {
    @Autowired
    UserRepository ur;
    @Autowired
    UserConverter uc;

    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/users/{username}")
    public @ResponseBody
    UserDTO getUsers(@PathVariable String username) {

        return uc.convert(ur.findByUsername(username));
    }
}