package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class ClasseProdutoRepository extends BaseListRepository<ClasseProduto> {

    public ClasseProdutoRepository(@Autowired BaseFakeDB<ClasseProduto> db) {
        super(db);
    }

    @Override
    public ClasseProduto create(ClasseProduto object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public ClasseProduto update(long id, ClasseProduto object) {
        ClasseProduto existing = read(id);
        if(existing == null) return null;

        existing.setDescricao(object.getDescricao());

        return existing;
    }
    
}
