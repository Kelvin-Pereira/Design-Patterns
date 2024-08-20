package com.kodex.exemplos.api.user.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "_USER", schema = "DESIGN_PATTERNS")
public class UserEntity {

    @Id
    @Column(name = "ID_USER", nullable = false)
    @GeneratedValue(generator = "SEQ_USER", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NOME")
    private String nome;

}
