package br.com.felipe.controle_financeiro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Despesas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_desp;
    private String descricao_desp;
    private BigDecimal valor_desp;
    private LocalDateTime data_desp;

    public Long getId_desp() {
        return id_desp;
    }

    public void setId_desp(Long id_desp) {
        this.id_desp = id_desp;
    }

    public String getDescricao_desp() {
        return descricao_desp;
    }

    public void setDescricao_desp(String descricao_desp) {
        this.descricao_desp = descricao_desp;
    }

    public BigDecimal getValor_desp() {
        return valor_desp;
    }

    public void setValor_desp(BigDecimal valor_desp) {
        this.valor_desp = valor_desp;
    }

    public LocalDateTime getData_desp() {
        return data_desp;
    }

    public void setData_desp(LocalDateTime data_desp) {
        this.data_desp = data_desp;
    }
}
