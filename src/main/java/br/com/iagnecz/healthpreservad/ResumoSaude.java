/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iagnecz.healthpreservad;

/**
 *
 * @author Pichau
 */
public class ResumoSaude {
     public String gerarResumo(Usuario usuario) {
        return "Resumo de saúde para o usuário: " + usuario.getNome() + "\nDados disponíveis em outras classes.";
    }
}
