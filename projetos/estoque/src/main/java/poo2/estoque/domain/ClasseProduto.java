package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class ClasseProduto extends BaseDescricao {

    public ClasseProduto(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String descricao) {
        super(id, dataInclusao, dataAlteracao, descricao);
    }

    public ClasseProduto(){
        super();
    }

}
