package com.kodex.exemplos.api.user.service;

import com.kodex.exemplos.api.user.domain.dto.UserDTO;
import com.kodex.exemplos.api.user.domain.mapper.UserMapper;
import com.kodex.exemplos.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Page<UserDTO> buscarUserPageable(Pageable pageable) {
        return repository.findAll(pageable).map(UserMapper.INSTANCE::toDTO);
    }

}
