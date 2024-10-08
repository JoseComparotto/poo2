package poo2.estoque.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idSubclasse;

    private String descricao;
    private double valor;
    
    @Temporal(TemporalType.DATE)
    private LocalDate dataInclusao;
    
    @Temporal(TemporalType.DATE)
    private LocalDate dataAlteracao;

    public Produto(long id, long idSubclasse, String descricao, double valor, LocalDate dataInclusao,
            LocalDate dataAlteracao) {
        this.id = id;
        this.idSubclasse = idSubclasse;
        this.descricao = descricao;
        this.valor = valor;
        this.dataInclusao = dataInclusao;
        this.dataAlteracao = dataAlteracao;
    }

    public Produto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSubclasse() {
        return idSubclasse;
    }

    public void setIdSubclasse(long idSubclasse) {
        this.idSubclasse = idSubclasse;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
