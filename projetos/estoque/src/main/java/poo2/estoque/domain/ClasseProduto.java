package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class ClasseProduto extends BaseId {

    public ClasseProduto(long id, String descricao, LocalDate dataInclusao) {
        super(id, descricao, dataInclusao);
    }

    public ClasseProduto(){
        super();
    }

}
