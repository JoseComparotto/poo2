package br.com.apirest.vetshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseBreadService<TModel> {
    
    @Autowired
    protected JpaRepository<TModel, Long> repo;

    public BaseBreadService(JpaRepository<TModel, Long> repo){
        this.repo = repo;
    }

    public List<TModel> browse() {
        return this.repo.findAll().stream().toList();
    }

    public Optional<TModel> read(long id) {
        return this.repo.findById(id);
    }

    public abstract Optional<TModel> edit(long id, TModel object);

    public TModel add(TModel object) {
        return this.repo.save(object);
    }

    public Optional<TModel> delete(long id) {
        Optional<TModel> old = this.repo.findById(id);
        
        if(old.isPresent()) this.repo.delete(old.get());

        return old;
    }
    
}

