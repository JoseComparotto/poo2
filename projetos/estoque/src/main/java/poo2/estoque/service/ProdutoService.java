package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.model.Produto;

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

        entity.setIdSubclasse(object.getIdSubclasse());
        entity.setDescricao(object.getDescricao());
        entity.setDataAlteracao(LocalDate.now());
        
        return Optional.of(repo.save(entity));
    }
}
