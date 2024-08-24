package poo2.estoque.service;

import java.util.List;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.repository.BaseRepository;

@MappedSuperclass
public abstract class BaseService<TDomain> {
    
    protected BaseRepository<TDomain> repo;

    public abstract List<TDomain> browse();
    public abstract TDomain read(long id);
    public abstract TDomain edit(long id, TDomain object);
    public abstract TDomain add(TDomain object);
    public abstract TDomain delete(long id);

}
