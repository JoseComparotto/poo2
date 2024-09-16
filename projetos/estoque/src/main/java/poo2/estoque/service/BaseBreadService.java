package poo2.estoque.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.domain.BaseId;

@MappedSuperclass
public abstract class BaseBreadService<TDomain extends BaseId> {
    
    @Autowired
    protected JpaRepository<TDomain, Long> repo;

    public BaseBreadService(JpaRepository<TDomain, Long> repo){
        this.repo = repo;
    }

    public List<TDomain> browse() {
        return this.repo.findAll().stream().toList();
    }

    public TDomain read(long id) {
        return this.repo.findById(id).get();
    }

    public abstract TDomain edit(long id, TDomain object);

    public TDomain add(TDomain object) {
        object.setDataInclusao(LocalDate.now());
        return this.repo.save(object);
    }

    public TDomain delete(long id) {
        Optional<TDomain> old = this.repo.findById(id);
        if(!old.isPresent()) return null;

        this.repo.delete(old.get());

        return old.get();
    }
    
}
