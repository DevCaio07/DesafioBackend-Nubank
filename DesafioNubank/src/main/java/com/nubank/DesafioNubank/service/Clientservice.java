package com.nubank.DesafioNubank.service;

import com.nubank.DesafioNubank.model.Client;
import com.nubank.DesafioNubank.model.dto.ClientDTO;
import com.nubank.DesafioNubank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Clientservice {

    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(ClientDTO clientDTO){

    }

}


