package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class TipoFuncionario extends BaseDescricao {
    
    public TipoFuncionario(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String descricao) {
        super(id, dataInclusao, dataAlteracao, descricao);
    }

    public TipoFuncionario(){
        super();
    }

}
