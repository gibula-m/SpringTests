package pl.bakkchos.walli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.bakkchos.walli.data.UserEntity;
import pl.bakkchos.walli.data.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(userName);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + userName);
        } else {
            return new UserDetailsImpl(user);
        }
    }

}