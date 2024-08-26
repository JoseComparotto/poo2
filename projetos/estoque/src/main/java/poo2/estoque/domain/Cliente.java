package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Cliente extends BasePessoa {
    
    private String cpf;

    public Cliente(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String nome, String endereco,
            String cidade, String estado, String cep, String telefone, String email, String cpf) {
        super(id, dataInclusao, dataAlteracao, nome, endereco, cidade, estado, cep, telefone, email);
        this.cpf = cpf;
    }

    public Cliente() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
