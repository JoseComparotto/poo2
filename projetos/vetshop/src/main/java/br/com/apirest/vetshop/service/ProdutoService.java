package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Produto;

@Service
public class ProdutoService extends BaseBreadService<Produto> {
    
    public ProdutoService(JpaRepository<Produto, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<Produto> edit(long id, Produto object) {
        Optional<Produto> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Produto entity = old.get();

        entity.setNome(object.getNome());
        entity.setPreco(object.getPreco());
        
        return Optional.of(repo.save(entity));
    }
}
