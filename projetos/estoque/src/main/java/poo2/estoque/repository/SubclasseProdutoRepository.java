package poo2.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poo2.estoque.model.SubclasseProduto;

@Repository
public interface SubclasseProdutoRepository extends JpaRepository<SubclasseProduto, Long> {

}
