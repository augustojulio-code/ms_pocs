package com.ms.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.user.domain.UserModel;
import com.ms.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public UserModel saveUser(UserModel userModel) {
        return repository.save(userModel);
    }
}
