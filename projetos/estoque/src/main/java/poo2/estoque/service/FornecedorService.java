package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Fornecedor;
import poo2.estoque.repository.BaseRepository;

@Service
public class FornecedorService extends BaseBreadService<Fornecedor> {

    public FornecedorService(BaseRepository<Fornecedor> repository) {
        super(repository);
    }

}
