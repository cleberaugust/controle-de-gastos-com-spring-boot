package br.com.estudojava.gestao_custos.useCases;

import br.com.estudojava.gestao_custos.entity.Despesa;
import br.com.estudojava.gestao_custos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaUseCase {


    @Autowired
    private DespesaRepository despesaRepository;


    public Despesa execute(Despesa despesa) {

        if (despesa.getCategoria() == null || despesa.getData() == null
                || despesa.getDescricao() == null || despesa.getEmail() == null) {
            throw new IllegalArgumentException("Preencher todos os campos");
        }

        despesa = despesaRepository.save(despesa);
        return despesa;
    }
}
