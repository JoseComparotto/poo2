package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDescricao extends BaseId {
    
    protected String descricao;

    public BaseDescricao(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String descricao) {
        super(id, dataInclusao, dataAlteracao);
        this.descricao = descricao;
    }

    public BaseDescricao() {
        super();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
