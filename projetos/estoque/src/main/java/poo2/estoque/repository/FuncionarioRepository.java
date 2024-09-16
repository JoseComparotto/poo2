package poo2.estoque.repository;

import org.springframework.stereotype.Repository;
import poo2.estoque.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends IBaseJpaRepository<Funcionario> {
    
}
