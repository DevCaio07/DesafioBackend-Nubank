package com.nubank.DesafioNubank.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    @OneToMany(mappedBy = "Clientes", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Object> contatos = new ArrayList<>();

}
