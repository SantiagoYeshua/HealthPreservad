/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iagnecz.healthpreservad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 *
 * @author santi_s9q964y
 */

public class UsuarioDAO {
    
         private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hpdb");

    // Método para registrar um usuário no banco de dados
    public boolean registrarUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager(); // Cria o EntityManager para essa operação
        try {
            em.getTransaction().begin(); // Inicia a transação
            em.persist(usuario); // Persiste o objeto Usuario no banco de dados
            em.getTransaction().commit(); // Finaliza a transação
            return true; // Retorna sucesso
        } catch (Exception e) {
            e.printStackTrace(); // Mostra o erro no console
            em.getTransaction().rollback(); // Reverte a transação em caso de erro
            return false; // Indica falha
        } finally {
            em.close(); // Fecha o EntityManager
        }
    }

    // Método para autenticar um usuário pelo email e senha
    public Usuario autenticarUsuario(String email, String senha) {
        EntityManager em = emf.createEntityManager(); // Cria o EntityManager para essa operação
        try {
            // Busca o usuário no banco de dados com a query JPQL
            return em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.email = :email AND u.senha = :senha", Usuario.class)
                    .setParameter("email", email)
                    .setParameter("senha", senha)
                    .getSingleResult();
        } catch (Exception e) {
            e.printStackTrace(); // Mostra o erro no console (para depuração)
            return null; // Retorna null se a autenticação falhar
        } finally {
            em.close(); // Fecha o EntityManager
        }
    }
}
