package poo2.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.domain.BaseId;
import poo2.estoque.repository.BaseListRepository;

@MappedSuperclass
public abstract class BaseBreadService<TDomain extends BaseId> {
    
    @Autowired
    protected BaseListRepository<TDomain> repo;

    public BaseBreadService(BaseListRepository<TDomain> repository){
        this.repo = repository;
    }

    public List<TDomain> browse() {
        return this.repo.readAll();
    }

    public TDomain read(long id) {
        return this.repo.read(id);
    }

    public TDomain edit(long id, TDomain object) {
        return this.repo.update(id, object);
    }

    public TDomain add(TDomain object) {
        return this.repo.create(object);
    }

    public TDomain delete(long id) {
        return this.repo.delete(id);
    }
    
}
