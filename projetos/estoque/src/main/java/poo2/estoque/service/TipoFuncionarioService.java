package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.TipoFuncionario;

@Service
public class TipoFuncionarioService extends BaseBreadService<TipoFuncionario> {

    public TipoFuncionarioService(JpaRepository<TipoFuncionario, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<TipoFuncionario> edit(long id, TipoFuncionario object) {
        Optional<TipoFuncionario> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        TipoFuncionario entity = old.get();

        entity.setDescricao(object.getDescricao());
        entity.setDataAlteracao(LocalDate.now());
        
        return Optional.of(repo.save(entity));
    }
}
