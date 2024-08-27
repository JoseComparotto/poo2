package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Produto;
import poo2.estoque.repository.BaseListRepository;

@Service
public class ProdutoService extends BaseBreadService<Produto> {

    public ProdutoService(BaseListRepository<Produto> repository) {
        super(repository);
    }

}
