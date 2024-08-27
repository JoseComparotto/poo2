package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.TipoFuncionario;

@Component
public class TipoFuncionarioFakeDB extends BaseFakeDB<TipoFuncionario> {
    
    public TipoFuncionarioFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new TipoFuncionario(1L, LocalDate.now(), LocalDate.now(), "Diretor"));
        this.lista.add(new TipoFuncionario(2L, LocalDate.now(), LocalDate.now(), "Gerente"));
        this.lista.add(new TipoFuncionario(3L, LocalDate.now(), LocalDate.now(), "Supervisor"));
        this.lista.add(new TipoFuncionario(4L, LocalDate.now(), LocalDate.now(), "Administrativo"));
        this.lista.add(new TipoFuncionario(5L, LocalDate.now(), LocalDate.now(), "Operador de Caixa"));
        this.lista.add(new TipoFuncionario(6L, LocalDate.now(), LocalDate.now(), "Repositor de Estoque"));
        this.lista.add(new TipoFuncionario(7L, LocalDate.now(), LocalDate.now(), "Agente de Limpeza"));
    }

}
