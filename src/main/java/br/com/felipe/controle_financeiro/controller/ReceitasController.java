package br.com.felipe.controle_financeiro.controller;

import br.com.felipe.controle_financeiro.controller.dto.ReceitasDto;
import br.com.felipe.controle_financeiro.modelo.Receitas;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
public class ReceitasController {

    @RequestMapping("/receitas")
    public List<ReceitasDto> lista(){
        Receitas receitas = new Receitas("primeira receita", new BigDecimal("12.01"), LocalDate.of(2022, 01, 29));
        Receitas receitas2 = new Receitas("segunda receita", new BigDecimal("29.99"), LocalDate.of(2022, 01, 31));
        Receitas receitas3 = new Receitas("terceira receita", new BigDecimal("29.99"), LocalDate.of(2022, 01, 31));

        return ReceitasDto.converter(Arrays.asList(receitas, receitas2, receitas3));
    }
}
