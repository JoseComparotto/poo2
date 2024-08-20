package poo2.estoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.repository.ClasseProdutoRepository;

@Service
public class ClasseProdutoService extends BaseService<ClasseProduto> {

    public ClasseProdutoService(){
        this.repo = new ClasseProdutoRepository();
    }

    @Override
    public List<ClasseProduto> browse() {
        return this.repo.readAll();
    }

    @Override
    public ClasseProduto read(long id) {
        return this.repo.read(id);
    }

    @Override
    public ClasseProduto edit(ClasseProduto object) {
        return this.repo.update(object);
    }

    @Override
    public ClasseProduto add(ClasseProduto object) {
        return this.repo.create(object);
    }

    @Override
    public ClasseProduto delete(long id) {
        return this.repo.delete(id);
    }
    
}
