package com.nubank.DesafioNubank.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;
    private String Email;
    private Long Telefone;

    @OneToMany(
            mappedBy = "Client",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getTelefone() {
        return Telefone;
    }

    public void setTelefone(Long telefone) {
        Telefone = telefone;
    }
}
