package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import poo2.estoque.domain.SubclasseProduto;
import poo2.estoque.fakedb.SubclasseProdutoFakeDB;

@Repository
public class SubclasseProdutoRepository extends BaseListRepository<SubclasseProduto> {

    public SubclasseProdutoRepository(){
        SubclasseProdutoFakeDB db = new SubclasseProdutoFakeDB();
        storage = db.getLista();
    }

    @Override
    public SubclasseProduto create(SubclasseProduto object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public SubclasseProduto update(long id, SubclasseProduto object) {
        SubclasseProduto existing = read(id);
        if(existing == null) return null;

        object.setIdClasse(object.getIdClasse());
        object.setDescricao(object.getDescricao());

        return object;
    }
    
}
