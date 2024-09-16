package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.Cliente;

@Service
public class ClienteService extends BaseBreadService<Cliente> {
    
    public ClienteService(JpaRepository<Cliente, Long> repo){
        super(repo);
    }

    @Override
    public Cliente edit(long id, Cliente object) {
        Optional<Cliente> old = this.repo.findById(id);
        if(!old.isPresent()) return null;
        Cliente entity = old.get();

        entity.setCpf(object.getCpf());
        entity.setNome(object.getNome());
        entity.setEmail(object.getEmail());
        entity.setTelefone(object.getTelefone());
        entity.setCep(object.getCep());
        entity.setEndereco(object.getEndereco());
        entity.setCidade(object.getCidade());
        entity.setEstado(object.getEstado());

        entity.setDataAlteracao(LocalDate.now());
        
        return repo.save(entity);
    }
}
