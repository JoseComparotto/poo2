package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseId {

    @Id
    protected long id;
    protected String descricao;
    protected LocalDate dataInclusao;

    public BaseId(){
    }

    public BaseId(long id, String descricao, LocalDate dataInclusao) {
        this.id = id;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataExclusao) {
        this.dataInclusao = dataExclusao;
    }

    
}
