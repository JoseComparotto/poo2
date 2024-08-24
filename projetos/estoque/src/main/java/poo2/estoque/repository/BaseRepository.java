package poo2.estoque.repository;

import java.util.List;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRepository<TDomain> {
    
    protected List<TDomain> storage;
    
    public List<TDomain> readAll(){
        return storage;
    }

    public abstract TDomain create(TDomain object);
    public abstract TDomain read(long id);
    public abstract TDomain update(long id, TDomain object);
    public abstract TDomain delete(long id);

}
