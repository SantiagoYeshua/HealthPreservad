/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iagnecz.healthpreservad;

/**
 *
 * @author Pichau
 */
public class UsuarioProfissional extends Usuario {
     private String especialidade;

    //public UsuarioProfissional(int id, String nome, String email, String senha, String especialidade) {
    //    super(id, nome, email, senha);
     //   this.especialidade = especialidade;
  //  }

    public String getEspecialidade() {
        return especialidade;
    }

    public void acessarDadosPaciente(Usuario usuario) {
        System.out.println("Acessando dados do paciente: " + usuario.getNome());
    }
}
