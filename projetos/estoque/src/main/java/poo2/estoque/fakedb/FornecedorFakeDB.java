package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.Fornecedor;

@Component
public class FornecedorFakeDB extends BaseFakeDB<Fornecedor> {

    public FornecedorFakeDB() {
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new Fornecedor(1L, LocalDate.now(), LocalDate.now(), "Carne Prime Distribuidora",
                "Rua das Carnes, 123", "São Paulo", "SP", "01001-000", "(11) 1234-5678", "contato@carneprime.com.br",
                "12.345.678/0001-90"));

        this.lista.add(new Fornecedor(2L, LocalDate.now(), LocalDate.now(), "FrangoFácil Ltda",
                "Avenida dos Aves, 456", "Rio de Janeiro", "RJ", "20001-000", "(21) 9876-5432",
                "vendas@frangofacil.com.br", "23.456.789/0001-12"));

        this.lista.add(new Fornecedor(3L, LocalDate.now(), LocalDate.now(), "Suínos e Cia",
                "Travessa dos Suínos, 789", "Belo Horizonte", "MG", "30100-000", "(31) 3322-1100",
                "suinos@suecia.com.br", "34.567.890/0001-34"));

        this.lista.add(new Fornecedor(4L, LocalDate.now(), LocalDate.now(), "Bebidas Premium",
                "Rua das Bebidas, 101", "Curitiba", "PR", "80010-000", "(41) 2222-3344", "sac@bebidaspremium.com.br",
                "45.678.901/0001-56"));

        this.lista.add(new Fornecedor(5L, LocalDate.now(), LocalDate.now(), "Laticínios do Sul",
                "Estrada dos Laticínios, 202", "Porto Alegre", "RS", "90010-000", "(51) 4455-6677",
                "contato@laticiniossul.com.br", "56.789.012/0001-78"));

        this.lista.add(new Fornecedor(6L, LocalDate.now(), LocalDate.now(), "Biscoitos Belos",
                "Avenida dos Biscoitos, 303", "Fortaleza", "CE", "60010-000", "(85) 7788-9900",
                "sac@biscoitosbelos.com.br", "67.890.123/0001-90"));

        this.lista.add(new Fornecedor(7L, LocalDate.now(), LocalDate.now(), "Limpeza Total",
                "Rua dos Produtos de Limpeza, 404", "Salvador", "BA", "40010-000", "(71) 8899-0011",
                "atendimento@limpezatotal.com.br", "78.901.234/0001-01"));

        this.lista.add(new Fornecedor(8L, LocalDate.now(), LocalDate.now(), "Álcool & Companhia",
                "Estrada das Destilarias, 505", "Brasília", "DF", "70010-000", "(61) 1122-3344",
                "alcool@alcoolcia.com.br", "89.012.345/0001-23"));

        this.lista.add(new Fornecedor(9L, LocalDate.now(), LocalDate.now(), "Queijos Finos",
                "Alameda dos Queijos, 606", "Recife", "PE", "50010-000", "(81) 5566-7788", "vendas@queijosfinos.com.br",
                "90.123.456/0001-34"));

        this.lista.add(new Fornecedor(10L, LocalDate.now(), LocalDate.now(), "Produtos Higienix",
                "Rodovia dos Produtos de Limpeza, 707", "Manaus", "AM", "69010-000", "(92) 6677-8899",
                "sac@higienix.com.br", "01.234.567/0001-45"));

    }

}
