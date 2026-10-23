package com.nubank.DesafioNubank.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Email;
    private Long Telefone;

    @ManyToMany
    @JoinColumn(name = "Clientes")
    @JsonBackReference
    private Client clientes;

}

