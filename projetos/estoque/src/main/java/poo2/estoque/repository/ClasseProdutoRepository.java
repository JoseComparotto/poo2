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
            .orElse(0L) + 1;

        object.setId(nextId);

        if(this.storage.add(object))
            return object;
        else
            return null;
    }

    @Override
    public ClasseProduto Read(int id) {
        return this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);
    }

    @Override
    public ClasseProduto Update(ClasseProduto object) {
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == object.getId() )
            .findFirst()
            .orElse(null);
        
        if(p == null) return null;

        p.setDescricao(object.getDescricao());
        return p;
    }

    @Override
    public ClasseProduto Delete(int id) {
        
        ClasseProduto p = this.storage.parallelStream()
            .filter( t -> t.getId() == id )
            .findFirst()
            .orElse(null);

        if(p!=null && this.storage.remove(p))
            return p;
        
        return null;
    }
    
}
