package poo2.estoque.repository;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoRepository extends BaseRepository<ClasseProduto> {

    public ClasseProdutoRepository(){
        ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        storage = db.getLista();
    }

    @Override
    public ClasseProduto Create(ClasseProduto object) {
        
        long nextId = this.storage.parallelStream()
            .map(t -> t.getId())
            .max((a, b)-> Long.compare(a, b))
            .orElse(Long.valueOf(0)) + 1;

        object.setId(nextId);
        
        return object;
    }

    @Override
    public ClasseProduto Read(int id) {
        return this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElseThrow();
    }

    @Override
    public ClasseProduto Update(int id, ClasseProduto object) {
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElseThrow();
        
        p.setDescricao(object.getDescricao());
        p.setDataInclusao(object.getDataInclusao());

        return p;
    }

    @Override
    public ClasseProduto Delete(int id) {
        
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);
        
        if(this.storage.remove(p))
            return p;
        else
            return null;
    }
    
}
