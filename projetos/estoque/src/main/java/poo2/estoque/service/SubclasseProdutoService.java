package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.SubclasseProduto;

@Service
public class SubclasseProdutoService extends BaseBreadService<SubclasseProduto> {

    public SubclasseProdutoService(JpaRepository<SubclasseProduto, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<SubclasseProduto> edit(long id, SubclasseProduto object) {
        Optional<SubclasseProduto> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        SubclasseProduto entity = old.get();

        entity.setIdClasse(object.getIdClasse());
        entity.setDescricao(object.getDescricao());
        entity.setDataAlteracao(LocalDate.now());
        
        return Optional.of(repo.save(entity));
    }

}
