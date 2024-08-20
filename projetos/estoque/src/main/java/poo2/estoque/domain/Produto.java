package poo2.estoque.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;

@Entity
public class Produto extends BaseId {
    
    private long idSubclasse;
    private double valor;
    
    public Produto() {
    }

    public Produto(long id, String descricao, LocalDate dataExclusao, long idSubclasse, double valor) {
        super(id, descricao, dataExclusao);
        this.idSubclasse = idSubclasse;
        this.valor = valor;
    }

    public long getIdSubclasse() {
        return idSubclasse;
    }

    public void setIdSubclasse(long idSubclasse) {
        this.idSubclasse = idSubclasse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
