package com.nubank.DesafioNubank.service;

import com.nubank.DesafioNubank.model.Client;
import com.nubank.DesafioNubank.dto.ClientDTO;
import com.nubank.DesafioNubank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Clientservice {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/save")
    public Client saveClient(ClientDTO clientDTO, long id){
        return this.clientRepository.saveAll().get();
    }


}


