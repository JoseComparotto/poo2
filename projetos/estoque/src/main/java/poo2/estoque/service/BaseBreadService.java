package poo2.estoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseBreadService<TDomain> {
    
    @Autowired
    protected JpaRepository<TDomain, Long> repo;

    public BaseBreadService(JpaRepository<TDomain, Long> repo){
        this.repo = repo;
    }

    public List<TDomain> browse() {
        return this.repo.findAll().stream().toList();
    }

    public Optional<TDomain> read(long id) {
        return this.repo.findById(id);
    }

    public abstract Optional<TDomain> edit(long id, TDomain object);

    public TDomain add(TDomain object) {
        //object.setDataInclusao(LocalDate.now());
        return this.repo.save(object);
    }

    public Optional<TDomain> delete(long id) {
        Optional<TDomain> old = this.repo.findById(id);
        
        if(old.isPresent()) this.repo.delete(old.get());

        return old;
    }
    
}
