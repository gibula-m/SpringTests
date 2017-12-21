package pl.bakkchos.springangular.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.bakkchos.springangular.UserDTO;

@Component
public class UserConverter implements Converter<UserEntity, UserDTO> {

    @Override
    public UserDTO convert(UserEntity from) {
        UserDTO user = new UserDTO();
        user.setUsername(from.getUsername());
        user.setPassword(from.getPassword());
        return user;
    }
}