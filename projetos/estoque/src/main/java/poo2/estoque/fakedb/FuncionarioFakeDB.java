package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.Funcionario;

@Component
public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    public FuncionarioFakeDB() {
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new Funcionario(1L, LocalDate.now(), LocalDate.now(), "Pedro Almeida",
                "Av. Paulista, 1000", "São Paulo", "SP", "01310-000", "(11) 99999-0001",
                "pedro.almeida@email.com", 1L, "senha123"));

        this.lista.add(new Funcionario(2L, LocalDate.now(), LocalDate.now(), "Maria Souza",
                "Rua XV de Novembro, 500", "Curitiba", "PR", "80020-000", "(41) 98888-0002",
                "maria.souza@email.com", 2L, "senha456"));

        this.lista.add(new Funcionario(3L, LocalDate.now(), LocalDate.now(), "José Santos",
                "Rua das Flores, 123", "Rio de Janeiro", "RJ", "20030-000", "(21) 97777-0003",
                "jose.santos@email.com", 3L, "senha789"));

        this.lista.add(new Funcionario(4L, LocalDate.now(), LocalDate.now(), "Carla Lima",
                "Avenida Brasil, 789", "Belo Horizonte", "MG", "30140-000", "(31) 96666-0004",
                "carla.lima@email.com", 4L, "senhaABC"));

        this.lista.add(new Funcionario(5L, LocalDate.now(), LocalDate.now(), "Rafael Costa",
                "Alameda Santos, 1500", "São Paulo", "SP", "01420-000", "(11) 95555-0005",
                "rafael.costa@email.com", 5L, "senhaDEF"));

        this.lista.add(new Funcionario(6L, LocalDate.now(), LocalDate.now(), "Fernanda Oliveira",
                "Rua do Comércio, 200", "Porto Alegre", "RS", "90030-000", "(51) 94444-0006",
                "fernanda.oliveira@email.com", 6L, "senhaGHI"));

        this.lista.add(new Funcionario(7L, LocalDate.now(), LocalDate.now(), "Lucas Martins",
                "Avenida das Nações, 350", "Salvador", "BA", "40040-000", "(71) 93333-0007",
                "lucas.martins@email.com", 7L, "senhaJKL"));

    }

}
