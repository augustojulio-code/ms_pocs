package com.ms.user.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.domain.UserModel;
import com.ms.user.dtos.UserRecordsDto;
import com.ms.user.service.UserService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordsDto userRescordDto) {

        var userModel = new UserModel();

        BeanUtils.copyProperties(userRescordDto, userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveUser(userModel));
    }

}
