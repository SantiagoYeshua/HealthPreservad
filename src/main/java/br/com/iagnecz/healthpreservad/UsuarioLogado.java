/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iagnecz.healthpreservad;

/**
 *
 * @author santi_s9q964y
 */
public class UsuarioLogado {
    private static UsuarioLogado instancia;
    private Long id;
    private String nome;
    private String email;

    private UsuarioLogado() {
        // Construtor privado para implementar o padrão Singleton
    }

    public static UsuarioLogado getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioLogado();
        }
        return instancia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void limpar() {
        id = null;
        nome = null;
        email = null;
    }
}
