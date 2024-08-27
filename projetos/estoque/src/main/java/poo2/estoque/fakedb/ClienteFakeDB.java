package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.Cliente;

@Component
public class ClienteFakeDB extends BaseFakeDB<Cliente> {

    public ClienteFakeDB() {
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new Cliente(1L, LocalDate.now(), LocalDate.now(), "Ana Silva",
                "Rua das Flores, 123", "São Paulo", "SP", "01001-000", "(11) 98765-4321",
                "ana.silva@email.com", "123.456.789-01"));

        this.lista.add(new Cliente(2L, LocalDate.now(), LocalDate.now(), "Bruno Costa",
                "Avenida Brasil, 456", "Rio de Janeiro", "RJ", "20001-000", "(21) 91234-5678",
                "bruno.costa@email.com", "234.567.890-12"));

        this.lista.add(new Cliente(3L, LocalDate.now(), LocalDate.now(), "Carlos Pereira",
                "Rua dos Andradas, 789", "Belo Horizonte", "MG", "30100-000", "(31) 99876-5432",
                "carlos.pereira@email.com", "345.678.901-23"));

        this.lista.add(new Cliente(4L, LocalDate.now(), LocalDate.now(), "Daniela Santos",
                "Praça da Liberdade, 101", "Curitiba", "PR", "80010-000", "(41) 98765-1234",
                "daniela.santos@email.com", "456.789.012-34"));

        this.lista.add(new Cliente(5L, LocalDate.now(), LocalDate.now(), "Eduardo Souza",
                "Alameda das Palmeiras, 202", "Porto Alegre", "RS", "90010-000", "(51) 91234-5678",
                "eduardo.souza@email.com", "567.890.123-45"));

        this.lista.add(new Cliente(6L, LocalDate.now(), LocalDate.now(), "Fernanda Lima",
                "Rua da Paz, 303", "Fortaleza", "CE", "60010-000", "(85) 99876-5432",
                "fernanda.lima@email.com", "678.901.234-56"));

        this.lista.add(new Cliente(7L, LocalDate.now(), LocalDate.now(), "Gabriel Martins",
                "Avenida das Nações, 404", "Salvador", "BA", "40010-000", "(71) 98765-1234",
                "gabriel.martins@email.com", "789.012.345-67"));

        this.lista.add(new Cliente(8L, LocalDate.now(), LocalDate.now(), "Helena Oliveira",
                "Rua dos Pinhais, 505", "Brasília", "DF", "70010-000", "(61) 91234-5678",
                "helena.oliveira@email.com", "890.123.456-78"));

        this.lista.add(new Cliente(9L, LocalDate.now(), LocalDate.now(), "Igor Mendes",
                "Alameda das Acácias, 606", "Recife", "PE", "50010-000", "(81) 99876-5432",
                "igor.mendes@email.com", "901.234.567-89"));

        this.lista.add(new Cliente(10L, LocalDate.now(), LocalDate.now(), "Juliana Fernandes",
                "Rodovia das Flores, 707", "Manaus", "AM", "69010-000", "(92) 98765-1234",
                "juliana.fernandes@email.com", "012.345.678-90"));

    }

}
