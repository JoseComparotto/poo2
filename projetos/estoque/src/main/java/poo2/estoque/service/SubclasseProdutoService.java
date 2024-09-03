package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.SubclasseProduto;
import poo2.estoque.repository.BaseRepository;

@Service
public class SubclasseProdutoService extends BaseBreadService<SubclasseProduto> {

    public SubclasseProdutoService(BaseRepository<SubclasseProduto> repository) {
        super(repository);
    }

}
