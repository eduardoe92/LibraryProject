package com.libraryproject.libraryproject.repositories;

import com.libraryproject.libraryproject.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
