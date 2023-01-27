package br.com.joinfacestest.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.joinfacestest.domain.model.Cliente;
import br.com.joinfacestest.domain.repository.ClienteRepository;

@DataJpaTest
public class TestClienteRepository {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void testSalvar() {

        Cliente cli = new Cliente("Cliente 1",  "cliente1@email.com");
        Cliente cliSalvo = clienteRepository.save(cli);

        assertNotNull(cliSalvo);
    }

}
