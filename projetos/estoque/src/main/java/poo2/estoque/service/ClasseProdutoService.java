package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.ClasseProduto;

@Service
public class ClasseProdutoService extends BaseBreadService<ClasseProduto> {

    public ClasseProdutoService(JpaRepository<ClasseProduto, Long> repository) {
        super(repository);
    }

    @Override
    public ClasseProduto edit(long id, ClasseProduto object) {
        Optional<ClasseProduto> old = this.repo.findById(id);
        if(!old.isPresent()) return null;
        ClasseProduto entity = old.get();

        entity.setDescricao(object.getDescricao());
        entity.setDataAlteracao(LocalDate.now());
        
        return repo.save(entity);
    }

}
