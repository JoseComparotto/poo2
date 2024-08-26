package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Funcionario extends BasePessoa {

    private long idTipoFuncionario;
    private String senha;

    public Funcionario(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String nome, String endereco,
            String cidade, String estado, String cep, String telefone, String email, long idTipoFuncionario,
            String senha) {
        super(id, dataInclusao, dataAlteracao, nome, endereco, cidade, estado, cep, telefone, email);
        this.idTipoFuncionario = idTipoFuncionario;
        this.senha = senha;
    }

    public Funcionario() {
        super();
    }

    public long getIdTipoFuncionario() {
        return idTipoFuncionario;
    }

    public void setIdTipoFuncionario(long idTipoFuncionario) {
        this.idTipoFuncionario = idTipoFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
