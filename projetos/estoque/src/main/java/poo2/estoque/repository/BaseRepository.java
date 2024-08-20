package poo2.estoque.repository;

import java.util.List;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRepository<TDomain> {
    
    protected List<TDomain> storage;
    
    public List<TDomain> ReadAll(){
        return storage;
    }

    public abstract TDomain Create(TDomain object);
    public abstract TDomain Read(int id);
    public abstract TDomain Update(TDomain object);
    public abstract TDomain Delete(int id);

}
