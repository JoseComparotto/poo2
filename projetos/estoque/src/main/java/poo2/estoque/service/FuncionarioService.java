package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.model.Funcionario;

@Service
public class FuncionarioService extends BaseBreadService<Funcionario> {

    public FuncionarioService(JpaRepository<Funcionario, Long> repo){
        super(repo);
    }

    @Override
    public Optional<Funcionario> edit(long id, Funcionario object) {
        Optional<Funcionario> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Funcionario entity = old.get();

        entity.setIdTipoFuncionario(object.getIdTipoFuncionario());
        entity.setNome(object.getNome());
        entity.setEmail(object.getEmail());
        entity.setTelefone(object.getTelefone());
        entity.setCep(object.getCep());
        entity.setEndereco(object.getEndereco());
        entity.setCidade(object.getCidade());
        entity.setEstado(object.getEstado());
        entity.setSenha(object.getSenha());

        entity.setDataAlteracao(LocalDate.now());
        
        return Optional.of(repo.save(entity));
    }
}
