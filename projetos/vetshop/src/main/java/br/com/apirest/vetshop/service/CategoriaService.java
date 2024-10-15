package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Categoria;

@Service
public class CategoriaService extends BaseBreadService<Categoria> {
    
    public CategoriaService(JpaRepository<Categoria, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<Categoria> edit(long id, Categoria object) {
        Optional<Categoria> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Categoria entity = old.get();

        entity.setNome(object.getNome());
        
        return Optional.of(repo.save(entity));
    }
}
