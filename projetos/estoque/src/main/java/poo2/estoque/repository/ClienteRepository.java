package poo2.estoque.repository;

import org.springframework.stereotype.Repository;

import poo2.estoque.domain.Cliente;

@Repository
public interface ClienteRepository extends IBaseJpaRepository<Cliente> {
    
}
