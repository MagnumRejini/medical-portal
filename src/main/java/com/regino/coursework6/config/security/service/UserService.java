package com.regino.coursework6.config.security.service;

import com.regino.coursework6.config.security.model.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserEntity getUserEntityByEmail(String email);
}
