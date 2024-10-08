package poo2.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poo2.estoque.model.TipoFuncionario;

@Repository
public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionario, Long> {

}
