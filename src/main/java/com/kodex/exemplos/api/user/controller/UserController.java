package com.kodex.exemplos.api.user.controller;

import com.kodex.exemplos.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<Object> buscarPageUser(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(this.service.buscarUserPageable(pageable));
    }


}
