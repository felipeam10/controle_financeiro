package br.com.felipe.controle_financeiro.controller.dto;

import br.com.felipe.controle_financeiro.modelo.Receitas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ReceitasDto {

    private Long id_rec;
    private String descricao_rec;
    private BigDecimal valor_rec;
    private LocalDate data_rec;

    public ReceitasDto(Receitas receitas) {
        this.id_rec = receitas.getId_rec();
        this.descricao_rec = receitas.getDescricao_rec();
        this.valor_rec = receitas.getValor_rec();
        this.data_rec = receitas.getData_rec();
    }

    public Long getId_rec() {
        return id_rec;
    }

    public String getDescricao_rec() {
        return descricao_rec;
    }

    public BigDecimal getValor_rec() {
        return valor_rec;
    }

    public LocalDate getData_rec() {
        return data_rec;
    }

    public static List<ReceitasDto> converter(List<Receitas> receitas){
        return receitas.stream().map(ReceitasDto::new).collect(Collectors.toList());
    }
}
