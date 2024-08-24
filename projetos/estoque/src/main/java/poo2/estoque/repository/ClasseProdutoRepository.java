package poo2.estoque.repository;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoRepository extends BaseRepository<ClasseProduto> {

    public ClasseProdutoRepository(){
        ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        storage = db.getLista();
    }

    @Override
    public ClasseProduto create(ClasseProduto object) {
        
        long nextId = this.storage.parallelStream()
            .map(t -> t.getId())
            .max((a, b)-> Long.compare(a, b))
            .orElse(0L) + 1;

        object.setId(nextId);

        if(this.storage.add(object))
            return object;
        else
            return null;
    }

    @Override
    public ClasseProduto read(long id) {
        return this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);
    }

    @Override
    public ClasseProduto update(long id, ClasseProduto object) {
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);
        
        if(p == null) return null;

        p.setDescricao(object.getDescricao());
        return p;
    }

    @Override
    public ClasseProduto delete(long id) {
        
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);

        if(p!=null && this.storage.remove(p))
            return p;
        
        return null;
    }
    
}
