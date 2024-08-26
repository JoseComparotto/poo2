package poo2.estoque.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;

@Entity
public class Produto extends BaseDescricao {
    
    private long idSubclasse;
    private double valor;

    public Produto(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String descricao, long idSubclasse,
            double valor) {
        super(id, dataInclusao, dataAlteracao, descricao);
        this.idSubclasse = idSubclasse;
        this.valor = valor;
    }

    public Produto() {
        super();
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
