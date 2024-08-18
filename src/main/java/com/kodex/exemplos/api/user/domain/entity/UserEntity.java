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

}
