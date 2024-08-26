package poo2.estoque.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;

@Entity
public class SubclasseProduto extends BaseDescricao {
    
    private long idClasse;
    
    public SubclasseProduto(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String descricao, long idClasse) {
        super(id, dataInclusao, dataAlteracao, descricao);
        this.idClasse = idClasse;
    }

    public SubclasseProduto() {
        super();
    }

    public long getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(long idClasse) {
        this.idClasse = idClasse;
    }

}
