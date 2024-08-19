package com.kodex.exemplos.api.user.controller;

import com.kodex.exemplos.api.user.domain.dto.UserDTO;
import com.kodex.exemplos.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    @GetMapping
    public ResponseEntity<Page<UserDTO>> buscarPageUser(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(this.service.buscarUserPageable(pageable));
    }


}
