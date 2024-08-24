package poo2.estoque.repository;

import java.util.List;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.domain.BaseId;

@MappedSuperclass
public abstract class BaseListRepository<TDomain extends BaseId> {
    
    protected List<TDomain> storage;
    
    public List<TDomain> readAll(){
        return storage.stream().toList();
    }

    protected long getNextId(){
        return this.storage.stream()
            .map(t -> t.getId())
            .max((a, b)-> Long.compare(a, b))
            .orElse(0L) + 1L;
    }

    public TDomain read(long id) {
        return this.storage.stream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);
    }

    public TDomain delete(long id) {
        TDomain object = read(id);
        boolean removed = this.storage.remove(object);
        return removed ? object : null;
    }

    public abstract TDomain create(TDomain object);
    public abstract TDomain update(long id, TDomain object);


}
