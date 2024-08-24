package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.repository.BaseListRepository;

@Service
public class ClasseProdutoService extends BaseBreadService<ClasseProduto> {

    public ClasseProdutoService(BaseListRepository<ClasseProduto> repository) {
        super(repository);
    }

}
