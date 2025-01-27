/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.iagnecz.healthpreservad;

import java.time.LocalDate;

/**
 *
 * @author Pichau
 */
public class HealthPreservad {

    public static void main(String[] args) {
        
        new LoginVIEW().setVisible(true);

        // Criando um usuário
       // Usuario usuario = new Usuario(1, "João", "joao@email.com", "123456");

        // Criando um usuário profissional
       // UsuarioProfissional profissional = new UsuarioProfissional(2, "Dra. Maria", "maria@email.com", "prof123", "Cardiologia");

        // Autenticando o usuário
       // if (usuario.autenticar("joao@email.com", "123456")) {
         //   System.out.println("Login bem-sucedido!");

            // Registrando uma atividade física
         //   AtividadeFisica atividade = new AtividadeFisica(1, 1, "Corrida", 30, 300, LocalDate.now());
         //   atividade.registrarAtividade();

            // Registrando alimentação
          //  Alimentacao alimentacao = new Alimentacao(1, 1, "Maçã", 95, LocalDate.now());
         //   alimentacao.registrarAlimentacao();

            // Registrando indicadores de saúde
          //  IndicadorSaude indicador = new IndicadorSaude(1, 1, 70.5, 120, 80, 90.0, LocalDate.now());
          // indicador.registrarIndicador();

            // Gerando resumo de saúde
          //  ResumoSaude resumo = new ResumoSaude();
          //  System.out.println(resumo.gerarResumo(usuario));

            // Profissional acessando dados do paciente
           // profissional.acessarDadosPaciente(usuario);
       // } else {
        //    System.out.println("Email ou senha inválidos!");
        //}
        
    }
}
