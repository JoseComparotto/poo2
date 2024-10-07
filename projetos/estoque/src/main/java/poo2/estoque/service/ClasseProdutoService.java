package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.model.ClasseProduto;

@Service
public class ClasseProdutoService extends BaseBreadService<ClasseProduto> {

    public ClasseProdutoService(JpaRepository<ClasseProduto, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<ClasseProduto> edit(long id, ClasseProduto object) {
        Optional<ClasseProduto> old = this.repo.findById(id);
        if(!old.isPresent()) return old;

        ClasseProduto entity = old.get();

        entity.setDescricao(object.getDescricao());
        entity.setDataAlteracao(LocalDate.now());
        
        return Optional.of(repo.save(entity));
    }

}
