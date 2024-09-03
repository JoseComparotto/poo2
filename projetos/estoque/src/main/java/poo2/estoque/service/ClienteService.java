package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Cliente;
import poo2.estoque.repository.BaseRepository;

@Service
public class ClienteService extends BaseBreadService<Cliente> {

    public ClienteService(BaseRepository<Cliente> repository) {
        super(repository);
    }

}
