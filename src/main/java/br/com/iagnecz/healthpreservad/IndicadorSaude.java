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
@Table(name = "dados_fisicos") // Nome da tabela no banco de dados
public class IndicadorSaude {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id") // Coluna correspondente no banco de dados
    private Long userId;

    @Column(name = "altura")
    private int altura;

    @Column(name = "peso")
    private int peso;

    @Column(name = "pressao_arterial")
    private String pressaoArterial;

    @Column(name = "glicemia(mg/dl)")
    private Integer glicemia;

    @Column(name = "data")
    private LocalDate data;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public String getPressaoArterial() { return pressaoArterial; }
    public void setPressaoArterial(String pressaoArterial) { this.pressaoArterial = pressaoArterial; }

    public int getGlicemia() { return glicemia; }
    public void setGlicemia(int glicemia) { this.glicemia = glicemia; }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}
