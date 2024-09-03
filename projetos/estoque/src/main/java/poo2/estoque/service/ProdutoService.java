package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Produto;
import poo2.estoque.repository.BaseRepository;

@Service
public class ProdutoService extends BaseBreadService<Produto> {

    public ProdutoService(BaseRepository<Produto> repository) {
        super(repository);
    }

}
