/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iagnecz.healthpreservad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.time.LocalDate;
/**
 *
 * @author Pichau
 */
@Entity
@Table(name = "atividade") // Nome da tabela no banco de dados
public class AtividadeFisica {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id") // Coluna correspondente no banco de dados
    private Long userId;

    @Column(name = "tipo_de_atividade")
    private String tipoDeAtividade;

    @Column(name = "duracao(min)")
    private Integer duracao;

    @Column(name = "calorias_queimadas")
    private Integer caloriasQueimadas;

    @Column(name = "data")
    private LocalDate data;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getTipoDeAtividade() { return tipoDeAtividade; }
    public void setTipoDeAtividade(String tipoDeAtividade) { this.tipoDeAtividade = tipoDeAtividade; }

    public Integer getDuracao() { return duracao; }
    public void setDuracao(Integer duracao) { this.duracao = duracao; }

    public Integer getCaloriasQueimadas() { return caloriasQueimadas; }
    public void setCaloriasQueimadas(Integer caloriasQueimadas) { this.caloriasQueimadas = caloriasQueimadas; }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}