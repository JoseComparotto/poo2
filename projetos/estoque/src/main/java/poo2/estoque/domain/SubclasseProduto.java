package poo2.estoque.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;

@Entity
public class SubclasseProduto extends BaseId {
    
    private long idClasse;

    public SubclasseProduto(long id, long idClasse, String descricao, LocalDate dataExclusao) {
        super(id, descricao, dataExclusao);
        this.idClasse = idClasse;
    }

    public SubclasseProduto(){
        super();
    }

    public long getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(long idClasse) {
        this.idClasse = idClasse;
    }

}
