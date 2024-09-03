package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.TipoFuncionario;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class TipoFuncionarioRepository extends BaseRepository<TipoFuncionario> {

    public TipoFuncionarioRepository(@Autowired BaseFakeDB<TipoFuncionario> db) {
        super(db);
    }

    @Override
    public TipoFuncionario create(TipoFuncionario object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());
        object.setDataAlteracao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public TipoFuncionario update(long id, TipoFuncionario object) {
        TipoFuncionario existing = read(id);
        if(existing == null) return null;

        existing.setDescricao(object.getDescricao());
        existing.setDataAlteracao(LocalDate.now());

        return existing;
    }
    
}
