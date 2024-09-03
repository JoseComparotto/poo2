package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.TipoFuncionario;
import poo2.estoque.repository.BaseRepository;

@Service
public class TipoFuncionarioService extends BaseBreadService<TipoFuncionario> {

    public TipoFuncionarioService(BaseRepository<TipoFuncionario> repository) {
        super(repository);
    }

}
