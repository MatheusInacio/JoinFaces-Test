package br.com.joinfacestest.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.joinfacestest.domain.model.Cliente;
import br.com.joinfacestest.domain.repository.ClienteRepository;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Getter
    @Setter
    Cliente cliente = new Cliente();

    public void salvar() {
        clienteRepository.save(cliente);
        cliente = new Cliente();
    }

    public List<Cliente> listaTodos() {
        return clienteRepository.findAll();
    }

}
