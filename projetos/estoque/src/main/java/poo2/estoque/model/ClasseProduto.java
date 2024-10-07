package poo2.estoque.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class ClasseProduto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricao;
    
    @Temporal(TemporalType.DATE)
    private LocalDate dataInclusao;
    
    @Temporal(TemporalType.DATE)
    private LocalDate dataAlteracao;

    public ClasseProduto(long id, String descricao, LocalDate dataInclusao, LocalDate dataAlteracao) {
        this.id = id;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
        this.dataAlteracao = dataAlteracao;
    }

    public ClasseProduto() {
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
