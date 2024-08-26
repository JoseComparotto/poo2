package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.SubclasseProduto;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class SubclasseProdutoRepository extends BaseListRepository<SubclasseProduto> {

    public SubclasseProdutoRepository(@Autowired BaseFakeDB<SubclasseProduto> db) {
        super(db);
    }

    @Override
    public SubclasseProduto create(SubclasseProduto object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());
        object.setDataAlteracao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public SubclasseProduto update(long id, SubclasseProduto object) {
        SubclasseProduto existing = read(id);
        if(existing == null) return null;

        existing.setIdClasse(object.getIdClasse());
        existing.setDescricao(object.getDescricao());
        existing.setDataAlteracao(LocalDate.now());

        return existing;
    }
    
}
