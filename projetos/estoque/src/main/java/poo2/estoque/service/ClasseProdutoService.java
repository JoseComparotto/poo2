package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.repository.BaseRepository;

@Service
public class ClasseProdutoService extends BaseService<ClasseProduto> {

    public ClasseProdutoService(BaseRepository<ClasseProduto> repository) {
        super(repository);
    }

}
