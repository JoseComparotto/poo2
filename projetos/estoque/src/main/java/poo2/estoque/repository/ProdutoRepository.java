package poo2.estoque.repository;

import org.springframework.stereotype.Repository;
import poo2.estoque.domain.Produto;

@Repository
public interface ProdutoRepository extends IBaseJpaRepository<Produto> {
}
