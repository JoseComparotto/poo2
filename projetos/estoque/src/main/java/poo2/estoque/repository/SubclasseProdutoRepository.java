package poo2.estoque.repository;

import org.springframework.stereotype.Repository;
import poo2.estoque.domain.SubclasseProduto;

@Repository
public interface SubclasseProdutoRepository extends IBaseJpaRepository<SubclasseProduto> {

}
