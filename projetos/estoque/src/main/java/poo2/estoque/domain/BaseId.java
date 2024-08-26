package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseId {

    @Id
    protected long id;
    protected LocalDate dataInclusao;
    protected LocalDate dataAlteracao;

    public BaseId(long id, LocalDate dataInclusao, LocalDate dataAlteracao) {
        this.id = id;
        this.dataInclusao = dataInclusao;
        this.dataAlteracao = dataAlteracao;
    }

    public BaseId() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    
}
