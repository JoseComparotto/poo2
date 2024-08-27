package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.TipoFuncionario;
import poo2.estoque.repository.BaseListRepository;

@Service
public class TipoFuncionarioService extends BaseBreadService<TipoFuncionario> {

    public TipoFuncionarioService(BaseListRepository<TipoFuncionario> repository) {
        super(repository);
    }

}
