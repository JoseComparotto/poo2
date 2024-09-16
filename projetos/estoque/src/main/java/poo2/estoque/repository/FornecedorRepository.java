package poo2.estoque.repository;

import org.springframework.stereotype.Repository;

import poo2.estoque.domain.Fornecedor;

@Repository
public interface FornecedorRepository extends IBaseJpaRepository<Fornecedor> {
    
}
