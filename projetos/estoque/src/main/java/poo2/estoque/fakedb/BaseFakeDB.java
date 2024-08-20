package poo2.estoque.fakedb;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseFakeDB<TDomain> {
    
    protected List<TDomain> lista;

    public BaseFakeDB() {
        lista = new ArrayList<>();
        this.preencherLista();
    }

    protected abstract void preencherLista();

    public List<TDomain> getLista() {
        return lista;
    }

    public void setLista(List<TDomain> lista) {
        this.lista = lista;
    }
    
}
