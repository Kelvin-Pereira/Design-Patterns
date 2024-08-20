package com.kodex.exemplos.api.user.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String cpf;
    private String email;
    private String nome;

}
