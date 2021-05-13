package com.regino.coursework6.config.security.service;

import com.regino.coursework6.config.security.model.UserDetailsImpl;
import com.regino.coursework6.config.security.model.UserEntity;
import com.regino.coursework6.config.security.repos.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var user = userRepository.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException("User doesn't exists"));
        return UserDetailsImpl.fromUser(user);
    }


    @Override
    public UserEntity getUserEntityByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }
}