package br.com.estudojava.gestao_custos.performace;


import br.com.estudojava.gestao_custos.entity.Despesa;
import br.com.estudojava.gestao_custos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {

    @Autowired
    DespesaRepository despesaRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Despesa> despesas = new ArrayList<>();
        System.out.println("Iniciando geração de seed");
        for (int i = 0; i <= 15000; i++) {
            Despesa despesa = new Despesa();
            despesa.setDescricao("Gasto n: " + i);
            despesa.setValor(BigDecimal.valueOf(10 + (i % 50)));
            despesa.setData(LocalDate.now().minusDays((i % 30)));
            despesa.setCategoria("TESTE");
            despesa.setEmail("performace@gmail.com");

            despesas.add(despesa);
        }
        despesaRepository.saveAll(despesas);
        System.out.println("Finalizando geração de seed");
    }
}
