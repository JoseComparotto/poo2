package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Funcionario;
import poo2.estoque.repository.BaseRepository;

@Service
public class FuncionarioService extends BaseBreadService<Funcionario> {

    public FuncionarioService(BaseRepository<Funcionario> repository) {
        super(repository);
    }

}
