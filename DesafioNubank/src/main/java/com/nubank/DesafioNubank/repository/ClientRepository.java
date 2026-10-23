package com.nubank.DesafioNubank.repository;

import com.nubank.DesafioNubank.model.Client;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Id> {


    ClassValue<Object> saveAll();
}
