package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.Produto;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class ProdutoRepository extends BaseRepository<Produto> {

    public ProdutoRepository(@Autowired BaseFakeDB<Produto> db) {
        super(db);
    }

    @Override
    public Produto create(Produto object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());
        object.setDataAlteracao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public Produto update(long id, Produto object) {
        Produto existing = read(id);
        if(existing == null) return null;

        existing.setIdSubclasse(object.getIdSubclasse());
        existing.setDescricao(object.getDescricao());
        existing.setValor(object.getValor());
        existing.setDataAlteracao(LocalDate.now());

        return existing;
    }
    
}
