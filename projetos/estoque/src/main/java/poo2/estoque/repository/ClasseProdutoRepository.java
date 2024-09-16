package poo2.estoque.repository;


import org.springframework.stereotype.Repository;

import poo2.estoque.domain.ClasseProduto;

@Repository
public interface ClasseProdutoRepository extends IBaseJpaRepository<ClasseProduto> {
    
}
