package pl.bakkchos.walli.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.bakkchos.walli.dto.UserDTO;
import pl.bakkchos.walli.data.UserEntity;

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