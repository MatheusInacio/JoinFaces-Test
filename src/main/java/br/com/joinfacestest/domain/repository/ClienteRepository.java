package br.com.joinfacestest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.joinfacestest.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // @Query("select cli from Cliente cli where cli.email = :email")
    // public Cliente finByEmail(@Param("Email") String email);

}
