package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Cliente;

@Service
public class ClienteService extends BaseBreadService<Cliente> {
    
    public ClienteService(JpaRepository<Cliente, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<Cliente> edit(long id, Cliente object) {
        Optional<Cliente> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Cliente entity = old.get();

        entity.setNome(object.getNome());
        entity.setCpf(object.getCpf());
        entity.setEmail(object.getEmail());
        entity.setTelefone(object.getTelefone());
        
        return Optional.of(repo.save(entity));
    }
}
