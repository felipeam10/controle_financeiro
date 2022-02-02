package br.com.felipe.controle_financeiro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Receitas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rec;
    private String descricao_rec;
    private BigDecimal valor_rec;
    private LocalDate data_rec;

    public Receitas(String descricao_rec, BigDecimal valor_rec, LocalDate data_rec) {
        this.descricao_rec = descricao_rec;
        this.valor_rec = valor_rec;
        this.data_rec = data_rec;
    }

    public Long getId_rec() {
        return id_rec;
    }

    public void setId_rec(Long id_rec) {
        this.id_rec = id_rec;
    }

    public String getDescricao_rec() {
        return descricao_rec;
    }

    public void setDescricao_rec(String descricao_rec) {
        this.descricao_rec = descricao_rec;
    }

    public BigDecimal getValor_rec() {
        return valor_rec;
    }

    public void setValor_rec(BigDecimal valor_rec) {
        this.valor_rec = valor_rec;
    }

    public LocalDate getData_rec() {
        return data_rec;
    }

    public void setData_rec(LocalDate data_rec) {
        this.data_rec = data_rec;
    }
}
